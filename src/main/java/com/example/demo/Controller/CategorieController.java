package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CategorieService;
import com.example.demo.entite.Categorie;
import com.example.demo.entite.Magasin;

@RestController
@CrossOrigin("*")
public class CategorieController {

	@Autowired
	private CategorieService categorieService;

	@GetMapping("/Categorie")
	public List<Categorie> getCategorie() {
		return categorieService.getCategories();
	}

	@PostMapping("/categorieSave")
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		return categorieService.savecCategorie(categorie);
	}

	@DeleteMapping("/categorieDelete")
	public void deleteCategorie(@RequestParam Integer id) {
		categorieService.deleteCategorie(id);
	}

	@PutMapping("/updateCategorie")
	public Categorie updateCategorie(@RequestBody Categorie categorie) {
	return null;
	}

}
