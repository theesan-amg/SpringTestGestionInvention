package com.example.demo.entite;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeId")
	private Long employeId;
	
	private String nom;
	private String prenom; 
	private String image; 
	private String email; 
	@Column(name = "login", unique=true, insertable=true, updatable=true, nullable=false)
	private String login; 
	@Column(name = "mdp", insertable=true, updatable=true, nullable=false)
	private String mdp; 
	private String actif; 
	private int magasinId; 
	private Date timestamp;
	

    public Employe(String login, String mdp, String actif) {
        this.login = login;
        this.mdp = mdp;
        this.actif = actif;
    }
    
	public Employe(Long id, String login, String mdp, String actif) {
		this.employeId= id;
		this.login=login;
		this.mdp = mdp;
		this.actif=actif;
	}

	public Employe(String login, String mdp) {
		this.login=login;
		this.mdp = mdp;
	}

	
	
	public Long getEmployeId() {
		return employeId;
	}
	public void setEmployeId(Long employeId) {
		this.employeId = employeId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getActif() {
		return actif;
	}
	public void setActif(String actif) {
		this.actif = actif;
	}
	public int getMagasinId() {
		return magasinId;
	}
	public void setMagasinId(int magasinId) {
		this.magasinId = magasinId;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	} 
	
	
	
	

}
