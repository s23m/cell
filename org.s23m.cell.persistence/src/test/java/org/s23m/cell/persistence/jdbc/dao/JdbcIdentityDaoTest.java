package org.s23m.cell.persistence.jdbc.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.s23m.cell.persistence.jdbc.dao.TestData.createIdentity;

import java.sql.SQLException;
import java.util.UUID;

import org.junit.Test;
import org.s23m.cell.persistence.model.Identity;

public class JdbcIdentityDaoTest extends AbstractJdbcTest {

	@Test
	public void testInsertionAndRetrieval() throws SQLException {
		final Identity identity = createIdentity(UUID.randomUUID().toString());

		identityDao.insert(identity);

		// now retrieve the result
		final Identity retrieved = identityDao.get(identity.getUuid());
		assertEquals(identity, retrieved);
	}

	@Test
	public void testMultipleInsertionAttemptsFail() throws SQLException {
		final String uuid = UUID.randomUUID().toString();
		final Identity identity = createIdentity(uuid);

		identityDao.insert(identity);

		try {
			identityDao.insert(identity);
			fail("Multiple inserts should be disallowed");
		} catch (final RuntimeException e) {
			// expected
		}
	}

	@Test
	public void testUpdate() throws SQLException {
		final String uuid = "1";

		final Identity identity = createIdentity(uuid);

		identityDao.insert(identity);

		// retrieve the result
		final Identity retrieved1 = identityDao.get(uuid);
		assertEquals(uuid, retrieved1.getUuid());

		// update the name
		final Identity modified = new Identity(identity.getUuid(), "changed name", identity.getPluralName(),
				identity.getCodeName(), identity.getPluralCodeName(), identity.getPayload());
		identityDao.update(modified);

		final Identity retrieved2 = identityDao.get(uuid);
		assertEquals(modified.getName(), retrieved2.getName());
	}
}
