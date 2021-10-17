package com.ashley.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashley.dojosandninjas.models.Dojo;
import com.ashley.dojosandninjas.services.DojoNinjaService;

@Controller
@RequestMapping("/dojos")
public class DojoController {
	@Autowired
	private DojoNinjaService aService;
	
	@GetMapping("/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/createDojo")
	public String dojoCreate(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newdojo.jsp";
		}
		this.aService.createDojo(dojo);
		return "redirect:/ninjas/new";
	}
	
	@GetMapping("/{id}")
	public String showDojo(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", this.aService.findDojo(id));
		return "dojolocations.jsp";
	}
}
