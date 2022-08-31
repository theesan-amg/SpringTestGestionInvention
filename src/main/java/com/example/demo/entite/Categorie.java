package com.example.demo.entite;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categorie")
	private Integer Categorie_id;
	private String nom;
	private Date time;
	public Integer getCategorie_id() {
		return Categorie_id;
	}
	public void setCategorie_id(Integer categorie_id) {
		this.Categorie_id = categorie_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
	
	
}
