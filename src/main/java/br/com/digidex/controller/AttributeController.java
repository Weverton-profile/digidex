package br.com.digidex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttributeController {
	
	@GetMapping("attributes")
	public String attributes() {
		return "attributes";
	}
}
