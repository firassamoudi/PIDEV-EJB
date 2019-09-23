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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ecole generated by hbm2java
 */
@Entity
@Table(name = "ecole", catalog = "neo3")
public class Ecole implements java.io.Serializable {

	private int idEcole;
	private String pays;
	private String nom;
	private Set<Diplome> diplomes = new HashSet<Diplome>(0);

	public Ecole() {
	}

	public Ecole(int idEcole) {
		this.idEcole = idEcole;
	}

	public Ecole(int idEcole, String pays, String nom, Set<Diplome> diplomes) {
		this.idEcole = idEcole;
		this.pays = pays;
		this.nom = nom;
		this.diplomes = diplomes;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idEcole", unique = true, nullable = false)
	public int getIdEcole() {
		return this.idEcole;
	}

	public void setIdEcole(int idEcole) {
		this.idEcole = idEcole;
	}

	@Column(name = "pays", length = 254)
	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Column(name = "Nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ecole")
	public Set<Diplome> getDiplomes() {
		return this.diplomes;
	}

	public void setDiplomes(Set<Diplome> diplomes) {
		this.diplomes = diplomes;
	}

	/**
	 * @param pays
	 * @param nom
	 */
	public Ecole(String pays, String nom) {
		super();
		this.pays = pays;
		this.nom = nom;
	}
	

}
