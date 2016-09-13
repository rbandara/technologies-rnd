// default package
// Generated Jun 12, 2013 9:28:29 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * Esirelationshipentity generated by hbm2java
 */
public class Esirelationshipentity implements java.io.Serializable {

	private EsirelationshipentityId id;
	private Esirelationship esirelationship;
	private Esientity esientityByToentityid;
	private Esientity esientityByFromentityid;
	private Date effectivetime;
	private BigDecimal factor;

	public Esirelationshipentity() {
	}

	public Esirelationshipentity(EsirelationshipentityId id,
			Esirelationship esirelationship, Esientity esientityByToentityid,
			Esientity esientityByFromentityid, Date effectivetime) {
		this.id = id;
		this.esirelationship = esirelationship;
		this.esientityByToentityid = esientityByToentityid;
		this.esientityByFromentityid = esientityByFromentityid;
		this.effectivetime = effectivetime;
	}

	public Esirelationshipentity(EsirelationshipentityId id,
			Esirelationship esirelationship, Esientity esientityByToentityid,
			Esientity esientityByFromentityid, Date effectivetime,
			BigDecimal factor) {
		this.id = id;
		this.esirelationship = esirelationship;
		this.esientityByToentityid = esientityByToentityid;
		this.esientityByFromentityid = esientityByFromentityid;
		this.effectivetime = effectivetime;
		this.factor = factor;
	}

	public EsirelationshipentityId getId() {
		return this.id;
	}

	public void setId(EsirelationshipentityId id) {
		this.id = id;
	}

	public Esirelationship getEsirelationship() {
		return this.esirelationship;
	}

	public void setEsirelationship(Esirelationship esirelationship) {
		this.esirelationship = esirelationship;
	}

	public Esientity getEsientityByToentityid() {
		return this.esientityByToentityid;
	}

	public void setEsientityByToentityid(Esientity esientityByToentityid) {
		this.esientityByToentityid = esientityByToentityid;
	}

	public Esientity getEsientityByFromentityid() {
		return this.esientityByFromentityid;
	}

	public void setEsientityByFromentityid(Esientity esientityByFromentityid) {
		this.esientityByFromentityid = esientityByFromentityid;
	}

	public Date getEffectivetime() {
		return this.effectivetime;
	}

	public void setEffectivetime(Date effectivetime) {
		this.effectivetime = effectivetime;
	}

	public BigDecimal getFactor() {
		return this.factor;
	}

	public void setFactor(BigDecimal factor) {
		this.factor = factor;
	}

}