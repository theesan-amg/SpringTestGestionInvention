package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Categorie;

@Repository
public interface CategorieRepo extends CrudRepository<Categorie, Integer>{

}
