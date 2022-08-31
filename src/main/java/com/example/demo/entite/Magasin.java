package com.example.demo.entite;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magasin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "magasin")
	private Long magasinId;
	
	private String ville;
	private int directeur_personnel_Id;
	private Date updated_at;
	
	public Long getMagasinId() {
		return magasinId;
	}
	public void setMagasinId(Long magasinId) {
		this.magasinId = magasinId;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getDirecteur_personnel_Id() {
		return directeur_personnel_Id;
	}
	public void setDirecteur_personnel_Id(int directeur_personnel_Id) {
		this.directeur_personnel_Id = directeur_personnel_Id;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
