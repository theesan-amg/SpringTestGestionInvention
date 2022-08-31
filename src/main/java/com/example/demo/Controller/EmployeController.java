package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeService;
import com.example.demo.entite.Employe;

@RestController
public class EmployeController {

	@Autowired
	private EmployeService employeService;
	
	@PostMapping("/RegisterEmploye")
	public Employe RegisterEmploye(@RequestBody Employe employe) {
		return employeService.registerEmploye(employe);
		
	}
	
}
