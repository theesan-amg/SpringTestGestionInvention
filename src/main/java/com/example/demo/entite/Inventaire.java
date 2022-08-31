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

}
