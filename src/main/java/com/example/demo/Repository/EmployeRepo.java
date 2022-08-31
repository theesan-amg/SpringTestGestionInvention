package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entite.Employe;

@Repository
public interface EmployeRepo extends CrudRepository<Employe, Integer>  {
	

}
