package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.Repository.MagasinRepo;
import com.example.demo.entite.Inventaire;
import com.example.demo.entite.Magasin;

@Service
public class MagasinService {

	@Autowired
	private MagasinRepo magasinRepo;
	
	public List<Magasin>getMagasin() {
		return (List<Magasin>) magasinRepo.findAll();
	}
	
	public Magasin saveMagasin(Magasin magasin) {
		return magasinRepo.save(magasin);
	}
	
	public void deleteMagasin (Integer id) {
		 magasinRepo.deleteById(id);
	}

}
