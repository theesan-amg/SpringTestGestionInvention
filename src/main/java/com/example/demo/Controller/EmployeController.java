package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeService;
import com.example.demo.entite.Employe;
import com.example.demo.entite.Inventaire;

@RestController
public class EmployeController {

	@Autowired
	private EmployeService employeService;
	
	
	@GetMapping("/RegisterEmploye")
	public List<Employe> getEmploye() {
		return employeService.getEmployes();
		
	}
	
	@PostMapping("/employeSave")
	public Employe saveEmploye (@RequestBody Employe employe) {
		return employeService.saveEmployes(employe);
	}
	
	@PutMapping("/employeUpdate")
	public Employe updateEmploye(@RequestBody Employe employe) {
	return null;
	}
	
	
	
	
	
	
}
