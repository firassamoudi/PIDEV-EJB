package tn.esprit.entities;
// Generated 19 oct. 2018 22:55:32 by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question", catalog = "neo3")
public class Question implements java.io.Serializable {

	private int idQuestion;
	private Test test;
	private String type;
	private String reponse;
	private String contenue;
	private String choixA;
	private String choixB;
	private String choixC;
	private String image;

	public Question() {
	}

	public Question(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public Question(int idQuestion, Test test, String type, String reponse, String contenue, String choixA,
			String choixB, String choixC, String image) {
		this.idQuestion = idQuestion;
		this.test = test;
		this.type = type;
		this.reponse = reponse;
		this.contenue = contenue;
		this.choixA = choixA;
		this.choixB = choixB;
		this.choixC = choixC;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idQuestion", unique = true, nullable = false)
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTest")
	public Test getTest() {
		return this.test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Column(name = "type", length = 254)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "reponse", length = 254)
	public String getReponse() {
		return this.reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	@Column(name = "contenue", length = 254)
	public String getContenue() {
		return this.contenue;
	}

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	@Column(name = "choixA", length = 254)
	public String getChoixA() {
		return this.choixA;
	}

	public void setChoixA(String choixA) {
		this.choixA = choixA;
	}

	@Column(name = "choixB", length = 254)
	public String getChoixB() {
		return this.choixB;
	}

	public void setChoixB(String choixB) {
		this.choixB = choixB;
	}

	@Column(name = "choixC", length = 254)
	public String getChoixC() {
		return this.choixC;
	}

	public void setChoixC(String choixC) {
		this.choixC = choixC;
	}

	@Column(name = "image", length = 254)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
