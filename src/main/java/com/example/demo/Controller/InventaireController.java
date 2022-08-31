package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.InventaireRepo;
import com.example.demo.Service.InventaireService;
import com.example.demo.entite.Categorie;
import com.example.demo.entite.Inventaire;

import java.util.List;

@RestController
@CrossOrigin("*")
public class InventaireController {

	@Autowired
	private InventaireService inventaireService;

	// voir touts les employe
	@GetMapping("/inventaires")
	public List<Inventaire> getInventaire() {
		return inventaireService.getInventaire();

	}
	
	// recuperer les employer par id 
	@GetMapping("/inventaires{id}")
	public Inventaire getInventaireByID(@PathVariable(value = "id") Integer id) {
		 inventaireService.getInventaireByIDs(id);
		return null;

	}

	// Create inventaire
	@PostMapping("/inventaireSave")
	public Inventaire saveInventaire(@RequestBody Inventaire inventaire) {
		return inventaireService.saveInventaire(inventaire);
	}

	// supprimer les employer
	@DeleteMapping("/inventaireEffacer")
	public void deleteInventaire(@RequestParam Integer id) {
		inventaireService.deleteInventaire(id);
	}
	
	//Modifier les employers
	@PutMapping("/inventaireUpdate")
	public Inventaire updateInventaire(@RequestBody Inventaire inventaire) {
	return null;
	}

}
