package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeRepo;
import com.example.demo.entite.Employe;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeRepo employeRepo;
	public Employe registerEmploye(Employe employe) {
		return employeRepo.save(employe);
	}

}
