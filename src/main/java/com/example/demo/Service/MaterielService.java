package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.Repository.MaterielRepo;
import com.example.demo.entite.Materiel;

@Service
public class MaterielService {

	@Autowired
	private MaterielRepo materielRepo;
	
	public List<Materiel> getMateriel(){
		return (List<Materiel>) materielRepo.findAll();
	}
	
	public Materiel savemateriel(Materiel materiel) {
		return materielRepo.save(materiel);
	}
	
	public void materielDelete (Integer id) {
		 materielRepo.deleteById(id);
	}
	
}
