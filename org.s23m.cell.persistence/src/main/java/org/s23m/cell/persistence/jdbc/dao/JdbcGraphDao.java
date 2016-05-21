package org.s23m.cell.persistence.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.s23m.cell.persistence.dao.GraphDao;
import org.s23m.cell.persistence.model.Graph;

public class JdbcGraphDao implements GraphDao {

	private static final String URR = "urr";
	private static final String UUID = "uuid";
	private static final String CATEGORY = "category";
	private static final String CONTAINER = "container";
	private static final String IS_ABSTRACT_VALUE = "isAbstractValue";
	private static final String MAX_CARDINALITY_VALUE_IN_CONTAINER = "maxCardinalityValueInContainer";
	private static final String PROPER_CLASS = "properClass";
	private static final String CONTENT_AS_XML = "contentAsXml";

	private static final String[] COLUMN_NAMES = {
		UUID,
		CATEGORY,
		CONTAINER,
		IS_ABSTRACT_VALUE,
		MAX_CARDINALITY_VALUE_IN_CONTAINER,
		PROPER_CLASS,
		CONTENT_AS_XML,
		URR
	};

	private static final String SELECT_BY_PK_TEMPLATE = SqlQueryTemplates.createSelectByIdQueryTemplate(Graph.class, URR);

	private static final String UPDATE_TEMPLATE = SqlQueryTemplates.createUpdateStatementTemplate(Graph.class, COLUMN_NAMES);

	private static final String INSERT_TEMPLATE = SqlQueryTemplates.createInsertStatementTemplate(Graph.class, COLUMN_NAMES);

	private final QueryRunner queryRunner;

	private final GraphGetHandler handler;

	public JdbcGraphDao(final QueryRunner queryRunner) {
		this.queryRunner = queryRunner;
		this.handler = new GraphGetHandler();
	}

	public Graph get(final String urr) {
		try {
			return queryRunner.query(SELECT_BY_PK_TEMPLATE, handler, urr);
		} catch (final SQLException e) {
			throw new RuntimeException("Could not retrieve Graph with URR '" + urr + "'", e);
		}
	}

	public void saveOrUpdate(final Graph graph) {
		try {
			// try updating first
			final Object[] parameters = {
					graph.getUuid(),
					graph.getCategory(),
					graph.getContainer(),
					graph.getIsAbstractValue(),
					graph.getMaxCardinalityValueInContainer(),
					graph.getProperClass(),
					graph.getContentAsXml(),
					graph.getUrr()
			};
			final int updates = queryRunner.update(UPDATE_TEMPLATE, parameters);
			if (updates == 0) {
				// record does not exist - insert it
				final int inserts = queryRunner.update(INSERT_TEMPLATE, parameters);
				if (inserts == 0) {
					throw new RuntimeException("Failed to insert Graph: " + graph);
				}
			}
		} catch (final SQLException e) {
			throw new RuntimeException("Could not save or update Graph: " + graph, e);
		}
	}

	private static class GraphGetHandler implements ResultSetHandler<Graph> {

		public Graph handle(final ResultSet resultSet) throws SQLException {
			final boolean hasNext = resultSet.next();
			if (hasNext) {
				final String uuid = resultSet.getString(UUID);
				final String category = resultSet.getString(CATEGORY);
				final String container = resultSet.getString(CONTAINER);
				final String isAbstractValue = resultSet.getString(IS_ABSTRACT_VALUE);
				final String maxCardinalityValueInContainer = resultSet.getString(MAX_CARDINALITY_VALUE_IN_CONTAINER);
				final String properClass = resultSet.getString(PROPER_CLASS);
				final String contentAsXml = resultSet.getString(CONTENT_AS_XML);
				final String urr = resultSet.getString(URR);

				final Graph result = new Graph();
				result.setUuid(uuid);
				result.setCategory(category);
				result.setContainer(container);
				result.setIsAbstractValue(isAbstractValue);
				result.setMaxCardinalityValueInContainer(maxCardinalityValueInContainer);
				result.setProperClass(properClass);
				result.setContentAsXml(contentAsXml);
				result.setUrr(urr);
				return result;
			} else {
				return null;
			}
		}
	}
}