package br.com.digidex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LevelController {
	
	@GetMapping("levels")
	public String levels() {
		return "levels";
	}
}
