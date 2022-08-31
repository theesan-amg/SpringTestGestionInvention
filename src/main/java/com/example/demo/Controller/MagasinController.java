package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.demo.Service.MagasinService;
import com.example.demo.entite.Inventaire;
import com.example.demo.entite.Magasin;

@RestController
@CrossOrigin("*")
public class MagasinController {

	@Autowired
	private MagasinService magasinService;

	@GetMapping("/magasin")
	public List<Magasin> getMagasin() {
		return magasinService.getMagasin();
	}

	@PostMapping("/magasinSave")
	public Magasin saveMagasin(@RequestBody Magasin magasin) {
		return magasinService.saveMagasin(magasin);
	}

	@DeleteMapping("/magasinSupp")
	public void deleteMagasin(@RequestParam Integer id) {
		magasinService.deleteMagasin(id);
	}

}
