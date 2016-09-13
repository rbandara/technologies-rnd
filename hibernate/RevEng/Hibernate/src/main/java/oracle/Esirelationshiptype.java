// default package
// Generated Jun 12, 2013 9:28:29 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Esirelationshiptype generated by hbm2java
 */
public class Esirelationshiptype implements java.io.Serializable {

	private String relationshiptype;
	private String description;
	private Set esirelationships = new HashSet(0);

	public Esirelationshiptype() {
	}

	public Esirelationshiptype(String relationshiptype) {
		this.relationshiptype = relationshiptype;
	}

	public Esirelationshiptype(String relationshiptype, String description,
			Set esirelationships) {
		this.relationshiptype = relationshiptype;
		this.description = description;
		this.esirelationships = esirelationships;
	}

	public String getRelationshiptype() {
		return this.relationshiptype;
	}

	public void setRelationshiptype(String relationshiptype) {
		this.relationshiptype = relationshiptype;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getEsirelationships() {
		return this.esirelationships;
	}

	public void setEsirelationships(Set esirelationships) {
		this.esirelationships = esirelationships;
	}

}
