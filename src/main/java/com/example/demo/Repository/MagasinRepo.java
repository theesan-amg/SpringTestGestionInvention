package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Magasin;

@Repository
public interface MagasinRepo extends CrudRepository<Magasin, Integer>{

}
