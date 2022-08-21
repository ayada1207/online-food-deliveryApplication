package com.foodservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.foodservice.model.Product;
import com.foodservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public List<Product> findAll() {
		return this.productRepo.findAll();
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return this.productRepo.save(product);
	}

	@Override
	public Optional<Product> findById(@PathVariable Long id) {
		return this.productRepo.findById(id);
				}

}
