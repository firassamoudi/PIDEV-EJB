package tn.esprit.entities;
// Generated 19 oct. 2018 22:55:32 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Metier generated by hbm2java
 */
@Entity
@Table(name = "metier", catalog = "neo3")
public class Metier implements java.io.Serializable {

	private int idMetier;

	private String libelleMetier;
	private Set<Employe> employes = new HashSet<Employe>(0);
	public Metier() {
	}

	public Metier(int idMetier) {
		this.idMetier = idMetier;
	}

	public Metier(int idMetier,  String libelleMetier) {
		this.idMetier = idMetier;

		this.libelleMetier = libelleMetier;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idMetier", unique = true, nullable = false)
	public int getIdMetier() {
		return this.idMetier;
	}

	public void setIdMetier(int idMetier) {
		this.idMetier = idMetier;
	}


	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "metier")
	public Set<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}

	@Column(name = "libelleMetier", length = 254)
	public String getLibelleMetier() {
		return this.libelleMetier;
	}

	public void setLibelleMetier(String libelleMetier) {
		this.libelleMetier = libelleMetier;
	}

	@Override
	public String toString() {
		return "Metier [libelleMetier=" + libelleMetier + "]";
	}
	

}
