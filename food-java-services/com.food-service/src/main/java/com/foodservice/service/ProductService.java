package com.foodservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.foodservice.model.Product;

public interface ProductService {

	public List<Product> findAll();
	
	public Product save(@RequestBody Product product);
	
	public Optional<Product> findById(@PathVariable Long id);
	
}
