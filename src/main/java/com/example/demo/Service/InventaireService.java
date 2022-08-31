package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Repository.InventaireRepo;

import com.example.demo.entite.Inventaire;

import java.util.List;

@Service
public class InventaireService {
	
		
		@Autowired
		private InventaireRepo inventaireRepo;
		
		
		public List<Inventaire> getInventaire() {
			return (List<Inventaire>) inventaireRepo.findAll();
			 
		}
		
		public Inventaire saveInventaire(Inventaire inventaire) {
			return inventaireRepo.save(inventaire);
		}
		
		public void deleteInventaire (Integer id) {
			 inventaireRepo.deleteById(id);
		}



}
