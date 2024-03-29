package tn.esprit.entities;
// Generated 19 oct. 2018 22:55:32 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Critere generated by hbm2java
 */
@Entity
@Table(name = "critere", catalog = "neo3")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property ="idcritere")
public class Critere implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idcritere;
	private String fait;
	private String risque;
	private Set<SuiviRisk> suiviRisks = new HashSet<SuiviRisk>(0);

	public Critere() {
	}

	public Critere(String idcritere) {
		this.idcritere = idcritere;
	}

	public Critere(String idcritere, String fait, String risque, Set<SuiviRisk> suiviRisks) {
		this.idcritere = idcritere;
		this.fait = fait;
		this.risque = risque;
		this.suiviRisks = suiviRisks;
	}

	@Id

	@Column(name = "idcritere", unique = true, nullable = false, length = 254)
	public String getIdcritere() {
		return this.idcritere;
	}

	public void setIdcritere(String idcritere) {
		this.idcritere = idcritere;
	}

	@Column(name = "fait", length = 254)
	public String getFait() {
		return this.fait;
	}

	public void setFait(String fait) {
		this.fait = fait;
	}

	@Column(name = "risque", length = 254)
	public String getRisque() {
		return this.risque;
	}

	public void setRisque(String risque) {
		this.risque = risque;
	}

	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "critere")
	public Set<SuiviRisk> getSuiviRisks() {
		return this.suiviRisks;
	}

	public void setSuiviRisks(Set<SuiviRisk> suiviRisks) {
		this.suiviRisks = suiviRisks;
	}

}
