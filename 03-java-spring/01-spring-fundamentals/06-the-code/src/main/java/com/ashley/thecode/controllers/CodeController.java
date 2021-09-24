package com.ashley.thecode.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/code")
	public String code(@RequestParam("code") String code, Model model, RedirectAttributes redirect) {
		if(code.equals("bushido")) {
			ArrayList<String> codeDisplay = new ArrayList<String>();
			codeDisplay.add("Loyalty");
			codeDisplay.add("Courage");
			codeDisplay.add("Veracity");
			codeDisplay.add("Compassion");
			codeDisplay.add("Honor");
			model.addAttribute("codeDisplay", codeDisplay);
			return "code.jsp";
		} 
		else {
			redirect.addFlashAttribute("errorMessage", "You must train harder!");
			return "redirect:/";	
			}
	}
}

