package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.MaterielRepo;
import com.example.demo.Service.MaterielService;
import com.example.demo.entite.Materiel;

@RestController
@CrossOrigin("*")
public class MaterielController {

	@Autowired
	private MaterielService materielService;

	
	@GetMapping("/materiel")
	public List<Materiel> getMateriel(){
		return materielService.getMateriel();
	}
	
	@PostMapping("/materielSave")
	public Materiel saveMateriel(@RequestBody Materiel materiel) {
		return materielService.savemateriel(materiel);
	}
	
	@DeleteMapping("/materielSupp")
	public void materieldelete (@RequestParam Integer id) {
		materielService.materielDelete(id);
	}
	
}
