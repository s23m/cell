package org.s23m.cell.communication.xml

class XmlSchemaTemplate {
	
	// TODO: add jargon support
	def createHumanReadableSchema() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema"
				xmlns:s23m="http://schemas.s23m.org/serialization/2012"
				targetNamespace="http://schemas.s23m.org/serialization/2012"
				elementFormDefault="qualified"
				attributeFormDefault="unqualified">
		
			<!-- Reused elements -->	
		
			<xsd:element name="semanticIdentity" type="s23m:identityReference"/>
			<xsd:element name="model" type="s23m:model"/>
			<xsd:element name="category" type="s23m:identityReference"/>
			<xsd:element name="isAbstract" type="s23m:identityReference"/>
			<xsd:element name="maxCardinality" type="s23m:identityReference"/>
			<xsd:element name="minCardinality" type="s23m:identityReference"/>
			<xsd:element name="isContainer" type="s23m:identityReference"/>
			<xsd:element name="isNavigable" type="s23m:identityReference"/>
			<xsd:element name="from" type="s23m:identityReference"/>
			<xsd:element name="to" type="s23m:identityReference"/>
			<xsd:element name="function" type="s23m:function"/>
		
			<xsd:complexType name="identityReference">
				<xsd:sequence>
					<xsd:element name="uniqueRepresentationReference" type="s23m:uuid"/>
					<xsd:element name="identifier" type="s23m:uuid"/>
				</xsd:sequence>
			</xsd:complexType>
		
			<xsd:complexType name="category">
				<xsd:sequence>
					<xsd:element ref="s23m:semanticIdentity"/>
					<xsd:element ref="s23m:category"/>
				</xsd:sequence>		
			</xsd:complexType>
		
			<xsd:simpleType name="uuid">
				<xsd:restriction base="xsd:string"/>
			</xsd:simpleType>
		
			<!-- Root element -->
			<xsd:element name="artifactSet" type="s23m:artifactSet"/>
			
			<xsd:complexType name="artifactSet">
				<xsd:sequence>
					<xsd:element ref="s23m:model" minOccurs="0" maxOccurs="unbounded"/>
					<xsd:element name="semanticDomain" type="s23m:semanticDomain" minOccurs="0" maxOccurs="unbounded"/>
				</xsd:sequence>
			</xsd:complexType>
		
			<!-- Encoding of model artifacts -->
		
			<xsd:complexType name="model">
				<xsd:complexContent>
					<xsd:extension base="s23m:graph"/>
				</xsd:complexContent>
			</xsd:complexType>
		
			<xsd:complexType name="graph">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element name="container" type="s23m:identityReference"/>
							<xsd:element ref="s23m:isAbstract"/>
							<xsd:element name="vertex" type="s23m:vertex" minOccurs="0" maxOccurs="unbounded"/>
							<xsd:element name="visibility" type="s23m:visibility" minOccurs="0" maxOccurs="unbounded"/>
							<xsd:element name="edge" type="s23m:edge" minOccurs="0" maxOccurs="unbounded"/>
							<xsd:element name="superSetReference" type="s23m:superSetReference" minOccurs="0" maxOccurs="unbounded"/>            
							<xsd:element name="command" type="s23m:command" minOccurs="0" maxOccurs="unbounded"/>
							<xsd:element name="query" type="s23m:query" minOccurs="0" maxOccurs="unbounded"/>
						</xsd:sequence>
					</xsd:extension>
				</xsd:complexContent>
			</xsd:complexType>
		
			<!-- Vertices --> 
			<xsd:complexType name="vertex">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element ref="s23m:isAbstract"/>
							<xsd:element ref="s23m:maxCardinality"/>			
						</xsd:sequence>
					</xsd:extension>
				</xsd:complexContent>
			</xsd:complexType>
		
			<!-- Arrows --> 
			
			<xsd:complexType name="superSetReference">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element ref="s23m:isAbstract"/>
							<xsd:element ref="s23m:from"/>
							<xsd:element ref="s23m:to"/>
						</xsd:sequence>
					</xsd:extension>
				</xsd:complexContent>
			</xsd:complexType>
			<xsd:complexType name="visibility">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element ref="s23m:isAbstract"/>
							<xsd:element ref="s23m:from"/>
							<xsd:element ref="s23m:to"/>
						</xsd:sequence>
					</xsd:extension>
				</xsd:complexContent>
			</xsd:complexType>  
			<xsd:complexType name="edge">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element ref="s23m:isAbstract"/>
							<xsd:element name="from" type="s23m:edgeEnd"/>
							<xsd:element name="to" type="s23m:edgeEnd"/>
						</xsd:sequence>
					</xsd:extension>
				</xsd:complexContent>
			</xsd:complexType>
			<xsd:complexType name="edgeEnd">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element ref="s23m:isAbstract"/>
							<xsd:element ref="s23m:minCardinality"/>
							<xsd:element ref="s23m:maxCardinality"/>
							<xsd:element ref="s23m:isContainer"/>
							<xsd:element ref="s23m:isNavigable"/>
						</xsd:sequence>
					</xsd:extension>
				</xsd:complexContent>
			</xsd:complexType>
		
			<!-- Artifact functionality -->
			
			<xsd:complexType name="function">
				<xsd:complexContent>
					<xsd:extension base="s23m:category">
						<xsd:sequence>
							<xsd:element name="parameter" type="s23m:parameter" minOccurs="0" maxOccurs="unbounded"/>
						</xsd:sequence>
					</xsd:extension>			
				</xsd:complexContent>
			</xsd:complexType>
			<xsd:complexType name="parameter">
				<xsd:complexContent>
					<xsd:extension base="s23m:category"/>
				</xsd:complexContent>
			</xsd:complexType>
			<xsd:complexType name="command">
				<xsd:complexContent>
					<xsd:extension base="s23m:function"/>
				</xsd:complexContent>
			</xsd:complexType>
			<xsd:complexType name="query">
				<xsd:complexContent>
					<xsd:extension base="s23m:function"/>
				</xsd:complexContent>
			</xsd:complexType>
		
			<!-- Encoding of semantic domain artifacts -->
		
			<xsd:complexType name="semanticDomain">
				<xsd:sequence>
					<xsd:element ref="s23m:model"/>
					<xsd:element name="identity" type="s23m:identity" minOccurs="0" maxOccurs="unbounded"/>
				</xsd:sequence>
			</xsd:complexType>
		
			<xsd:complexType name="identity">
				<xsd:sequence>
					<xsd:element name="identifier" type="s23m:uuid"/>
					<xsd:element name="name" type="xsd:string"/>
					<xsd:element name="pluralName" type="xsd:string"/>
					<xsd:element name="payload" type="xsd:string"/>
					<xsd:element name="technicalName" type="xsd:string"/>
				</xsd:sequence>
			</xsd:complexType>
		</xsd:schema>
	'''
	
	def createMachineReadableSchema() '''
	'''
}