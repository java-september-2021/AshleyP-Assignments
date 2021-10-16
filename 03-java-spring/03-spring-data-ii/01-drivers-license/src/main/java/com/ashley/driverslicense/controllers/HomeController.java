package com.ashley.driverslicense.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashley.driverslicense.models.License;
import com.ashley.driverslicense.models.Person;
import com.ashley.driverslicense.services.DMVService;

@Controller
public class HomeController {
	@Autowired
	private DMVService dService;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("persons", this.dService.getAllPeople());
		return "index.jsp";
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String processPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newperson.jsp";
		}
		this.dService.createPerson(person);
		return "redirect:/";
	}
	
	@RequestMapping("/licenses/new")
	public String createLicense(Model model, @ModelAttribute("license") License license) {
		model.addAttribute("people", this.dService.getUnlicensedPeople());
		return "newlicense.jsp";
	}
	
	@RequestMapping(value="/newlicense", method=RequestMethod.POST)
	public String processLicense(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("people", this.dService.getUnlicensedPeople());
			return "newlicense.jsp";
		}
		this.dService.createLicense(license);
		return "redirect:/";
	}
	
	@RequestMapping("/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		model.addAttribute("person", this.dService.getOnePerson(id));
		return "show.jsp";
	}

}
