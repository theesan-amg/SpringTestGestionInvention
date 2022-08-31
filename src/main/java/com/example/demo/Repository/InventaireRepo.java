package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Employe;
import com.example.demo.entite.Inventaire;

@Repository
public interface InventaireRepo extends CrudRepository<Inventaire, Integer> {

}
