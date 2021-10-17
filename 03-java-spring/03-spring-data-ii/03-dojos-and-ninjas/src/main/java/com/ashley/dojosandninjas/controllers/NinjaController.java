package com.ashley.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashley.dojosandninjas.models.Ninja;
import com.ashley.dojosandninjas.services.DojoNinjaService;

@Controller
@RequestMapping("/ninjas")
public class NinjaController {
	@Autowired
	private DojoNinjaService dojoNinjaService;
	
	@RequestMapping("/new") 
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", this.dojoNinjaService.allDojos());
		return "newninja.jsp";
	}
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("dojos", this.dojoNinjaService.allDojos());
			return "newninja.jsp";
		}
		this.dojoNinjaService.createNinja(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
}
