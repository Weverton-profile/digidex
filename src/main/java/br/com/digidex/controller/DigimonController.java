package br.com.digidex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.digidex.model.Digimon;
import br.com.digidex.service.DigimonService;

@Controller
public class DigimonController {
	
	@Autowired
	DigimonService digimonService;

	@GetMapping("/home")
	public String index() {
		return "home";
	}
	
	@GetMapping("/digimon") 
	public String digimon(@RequestParam("name") String name, Model model) {
		if (name.isBlank()) {
			model.addAttribute("message", "fill in the field so we can search.");
			return "home";
		}
		Digimon digimon = digimonService.encontrarDigimonPorNome(name);
		if (digimon.getId() == null) {
			model.addAttribute("message", "The informed digimon was not found.");
			return "home";
		}
		model.addAttribute("digimon", digimon);
		return "digimon";
	}
	
	@ExceptionHandler(Exception.class)
	public String onError() {
		return "redirect:/home";
	}
}