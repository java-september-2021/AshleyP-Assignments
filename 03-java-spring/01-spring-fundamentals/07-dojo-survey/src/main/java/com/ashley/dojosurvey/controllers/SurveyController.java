package com.ashley.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/result", method=RequestMethod.POST)
	public String survey(@RequestParam("name") String name, @RequestParam("dojolocation") String dojoLocation, @RequestParam("favoritelanguage") String favoriteLanguage, @RequestParam("comment") String comment, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("dojolocation", dojoLocation);
		model.addAttribute("favoritelanguage", favoriteLanguage);
		model.addAttribute("comment", comment);
		return "result.jsp";
	}
}
