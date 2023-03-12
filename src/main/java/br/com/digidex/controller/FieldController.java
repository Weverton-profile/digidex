package br.com.digidex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FieldController {
	
	@GetMapping("/fields")
	public String fields() {
		return "fields";
	}
	
}
