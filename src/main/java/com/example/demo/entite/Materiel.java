package com.example.demo.entite;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materiel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "materiel")
	private int materiel_id;

	private String nom;
	private String descri;
	private String marque;
	private String image;
	@Enumerated(EnumType.ORDINAL)
	private Taille taille;
	private int duree_location;
	private int cout_location;
	private int cout_rempl;
	private int categorie_id;
	private Date time;
	
	public enum Taille {
	    petit, grand, moyen;
	}

	public int getMateriel_id() {
		return materiel_id;
	}

	public void setMateriel_id(int materiel_id) {
		this.materiel_id = materiel_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Taille getTaille() {
		return taille;
	}

	public void setTaille(Taille taille) {
		this.taille = taille;
	}

	public int getDuree_location() {
		return duree_location;
	}

	public void setDuree_location(int duree_location) {
		this.duree_location = duree_location;
	}

	public int getCout_location() {
		return cout_location;
	}

	public void setCout_location(int cout_location) {
		this.cout_location = cout_location;
	}

	public int getCout_rempl() {
		return cout_rempl;
	}

	public void setCout_rempl(int cout_rempl) {
		this.cout_rempl = cout_rempl;
	}

	public int getCategorie_id() {
		return categorie_id;
	}

	public void setCategorie_id(int categorie_id) {
		this.categorie_id = categorie_id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
	
}
