package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeRepo;
import com.example.demo.entite.Employe;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeRepo employeRepo;
	
	
	public List<Employe> getEmployes() {
		return (List<Employe>) employeRepo.findAll();
	}

	public Employe saveEmployes(Employe employe) {
		return employeRepo.save(employe);
	}
	
	public void deleteEmploye (Integer id) {
		 employeRepo.deleteById(id);
	}
	
	public Employe updateEmploye (Employe employe) {
		Long EmployeId = employe.getEmployeId();
		Employe emp = employeRepo.findById(employeId).get();
		emp.setActif(employe.getActif());
		emp.setEmail(employe.getEmail());
		return employeRepo.save(emp);
	}
	
}
