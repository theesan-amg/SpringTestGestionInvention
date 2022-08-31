package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Materiel;

@Repository
public interface MaterielRepo extends CrudRepository<Materiel, Integer>{
	

}
