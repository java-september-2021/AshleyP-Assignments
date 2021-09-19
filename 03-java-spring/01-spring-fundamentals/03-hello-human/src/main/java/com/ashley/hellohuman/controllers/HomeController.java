package com.ashley.hellohuman.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false, defaultValue="Human") String name, Model model) {
		return "Hello " + name + "!" + " " +
				"Welcome to SpringBoot!";
	}
}
