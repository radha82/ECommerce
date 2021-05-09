package com.example.Products.ProductsProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	@Autowired
	ProductRepository repository;
	
	
	@GetMapping("/products")
	List<Product> all() {
		return repository.findAll();
	}

}
