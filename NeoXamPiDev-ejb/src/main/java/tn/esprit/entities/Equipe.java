package tn.esprit.entities;
// Generated 19 oct. 2018 22:55:32 by Hibernate Tools 5.0.6.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
 * Equipe generated by hbm2java
 */
@Entity
@Table(name = "equipe", catalog = "neo3")
public class Equipe implements java.io.Serializable {

	private int idEquipe;
	private Employe employe;
	private Produit produit;
	private String labelEquipe;
	//private Set<Employe> employes = new HashSet<Employe>(0);

	public Equipe() {
	}

	public Equipe(int idEquipe, Produit produit) {
		this.idEquipe = idEquipe;
		//this.produit = produit;
	}

	
	
	
	public Equipe(String labelEquipe) {
		
		this.labelEquipe = labelEquipe;
	}

	public Equipe(int idEquipe, Employe employe, Produit produit, String labelEquipe,Set<Employe> employes) {
		this.idEquipe = idEquipe;
		this.employe = employe;
	//	this.produit = produit;
		this.labelEquipe = labelEquipe;
		
		//this.employes = employes;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idEquipe", unique = true, nullable = false)
	public int getIdEquipe() {
		return this.idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CIN")
	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name = "idPro", nullable = false)
	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Column(name = "labelEquipe", length = 254)
	public String getLabelEquipe() {
		return this.labelEquipe;
	}

	public void setLabelEquipe(String labelEquipe) {
		this.labelEquipe = labelEquipe;
	}

	/*@OneToMany(fetch = FetchType.EAGER, mappedBy = "equipe")
	public Set<Employe> getEmployes() {
		return this.employes;
	}

	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}*/

}
