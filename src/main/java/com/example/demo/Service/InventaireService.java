package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Repository.InventaireRepo;

import com.example.demo.entite.Inventaire;

import java.util.List;
import java.util.Optional;

@Service
public class InventaireService {
	
		
		@Autowired
		private InventaireRepo inventaireRepo;
		
		
		public List<Inventaire> getInventaire() {
			return (List<Inventaire>) inventaireRepo.findAll();
		}
		
		public Optional<Inventaire> getInventaireByIDs(Integer id) {
			return inventaireRepo.findById(id);
		}
		
		public Inventaire saveInventaire(Inventaire inventaire) {
			return inventaireRepo.save(inventaire);
		}
		
		public void deleteInventaire (Integer id) {
			 inventaireRepo.deleteById(id);
		}
		
		public Inventaire updateInventaire (Inventaire inventaire) {
			Integer inventaireId = inventaire.getInventaire_id();
			Inventaire inv = inventaireRepo.findById(inventaireId).get();
			inv.setInventaire_id(inventaire.getInventaire_id());
			inv.setMagasin_id(inventaire.getMagasin_id());
			inv.setMateriel_id(inventaire.getMateriel_id());
			inv.setTimestamp(inventaire.getTimestamp());
			return inventaireRepo.save(inv);
		}



}
