package com.ashley.productsandcategories.services;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashley.productsandcategories.models.Category;
import com.ashley.productsandcategories.models.Product;
import com.ashley.productsandcategories.repositories.CategoryRepository;
import com.ashley.productsandcategories.repositories.ProductRepository;

@Service
public class AppService {
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;
	
	public Product createProduct(Product newProduct) {
		return this.pRepo.save(newProduct);
	}
	
	public Category createCategory(Category newCategory) {
		return this.cRepo.save(newCategory);
	}
	
	public Category getOneCat(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Product getOneProd(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatNotProd(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public List<Product> findProdNotCat(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategoryToProd(Product product, Category category) {
		List<Category> existingCats = product.getCategories();
		existingCats.add(category);
		this.pRepo.save(product);
	}
	
	public void addProductToCategory(Product product, Category category) {
		List<Product> existingProds = category.getProducts();
		existingProds.add(product);
		this.cRepo.save(category);
	}
}
