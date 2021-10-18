package com.ashley.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashley.productsandcategories.models.Category;
import com.ashley.productsandcategories.models.Product;
import com.ashley.productsandcategories.services.AppService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private AppService aService;
	
	@GetMapping("/new")
	public String createCategory() {
		return "newcategory.jsp";
	}
	
	@PostMapping("/new")
	public String makeCategory(@RequestParam("category") String category) {
		Category newCat = new Category();
		newCat.setName(category);
		this.aService.createCategory(newCat);
		return "redirect:/categories/new";
	}
	
	@GetMapping("/{id}")
	public String showCat(Model model, @PathVariable("id") Long id) {
		Category catToShow = this.aService.getOneCat(id);
		model.addAttribute("notInCat", this.aService.findProdNotCat(catToShow));
		model.addAttribute("category", catToShow);
		return "categories.jsp";
	}
	
	@PostMapping("/addProdToCat/{id}")
	public String addProdToCat(@RequestParam("prod") Long id, @PathVariable("id") Long categoryid) {
		Category categoryToAddProdTo = this.aService.getOneCat(categoryid);
		Product productToAdd = this.aService.getOneProd(id);
		this.aService.addProductToCategory(productToAdd, categoryToAddProdTo);
		return "redirect:/categories/{id}";
	}

}
