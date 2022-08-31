package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategorieRepo;
import com.example.demo.entite.Categorie;
import com.example.demo.entite.Magasin;

@Service
public class CategorieService {

	@Autowired
	private CategorieRepo categorieRepo;
	
	
	public List<Categorie> getCategories(){
		return (List<Categorie>) categorieRepo.findAll();
	}
	
	public Categorie savecCategorie (Categorie categorie) {
		return categorieRepo.save(categorie);
	}
	
	public void deleteCategorie (Integer id) {
		categorieRepo.deleteById(id);
	}
	
	public Categorie updateCategorie (Categorie categorie) {
		Integer categroiId = categorie.getCategorie_id();
		Categorie ctg = categorieRepo.findById(categroiId).get();
		ctg.setCategorie_id(categorie.getCategorie_id());
		ctg.setNom(categorie.getNom());
		ctg.setTime(categorie.getTime());
		return categorieRepo.save(ctg);
		
	}
	
	
}
