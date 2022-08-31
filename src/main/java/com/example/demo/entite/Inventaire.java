package com.example.demo.entite;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "inventaire")
	private int inventaire_id;

	private int materiel_id;
	private int magasin_id;
	private Date timestamp;
	public int getInventaire_id() {
		return inventaire_id;
	}
	public void setInventaire_id(int inventaire_id) {
		this.inventaire_id = inventaire_id;
	}
	public int getMateriel_id() {
		return materiel_id;
	}
	public void setMateriel_id(int materiel_id) {
		this.materiel_id = materiel_id;
	}
	public int getMagasin_id() {
		return magasin_id;
	}
	public void setMagasin_id(int magasin_id) {
		this.magasin_id = magasin_id;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
