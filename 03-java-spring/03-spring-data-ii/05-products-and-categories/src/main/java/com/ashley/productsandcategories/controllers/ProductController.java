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
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private AppService aService;
	
	@GetMapping("/new")
	public String createProduct() {
		return "newproduct.jsp";
	}
	
	@PostMapping("/new")
	public String makeProduct(@RequestParam("name") String name, @RequestParam("desc") String desc, @RequestParam("price") Float price) {
		Product newProd = new Product(name, desc, price);
		this.aService.createProduct(newProd);
		return "redirect:/products/new";
	}
	
	@GetMapping("/{id}")
	public String showProd(Model model, @PathVariable("id") Long id) {
		Product productToShow = this.aService.getOneProd(id);
		model.addAttribute("notInProd", this.aService.findCatNotProd(productToShow));
		model.addAttribute("product", productToShow);
		return "products.jsp";
	}
	
	@PostMapping("/addCatToProd/{id}")
	public String addCatToProd(@RequestParam("cats") Long id, @PathVariable("id") Long productid) {
		Product productToAddCatTo = this.aService.getOneProd(productid);
		Category categoryToAdd = this.aService.getOneCat(id);
		this.aService.addCategoryToProd(productToAddCatTo, categoryToAdd);
		return "redirect:/products/{id}";
	}
	
}
