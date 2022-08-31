package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.InventaireRepo;
import com.example.demo.Service.InventaireService;
import com.example.demo.entite.Inventaire;

import java.util.List;
@RestController
@CrossOrigin("*")
public class InventaireController {

	@Autowired
	private InventaireService inventaireService;

	
	//voir
	@GetMapping("/inventaires")
	public List<Inventaire> getInventaire() {
		return inventaireService.getInventaire();

	}
	
	//Modifier et save 
	@PostMapping("/inventaireSave")
		public Inventaire saveInventaire(@RequestBody Inventaire inventaire) {
			return inventaireService.saveInventaire(inventaire);
		}


	//supprimer
	@DeleteMapping("/inventaireEffacer")
	public void deleteInventaire(@RequestParam Integer id) {
	 inventaireService.deleteInventaire(id);
}

}