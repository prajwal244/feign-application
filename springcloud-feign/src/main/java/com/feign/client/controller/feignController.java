package com.feign.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.feign.client.UserClient;
import com.feign.dto.Product;


@RestController

public class feignController {

	
	final UserClient userClient;
	
	@Autowired
	public feignController(UserClient userClient) {
		this.userClient =userClient;
		}
	
	@GetMapping("/feignproduct")
	public List findAllProducts() {
		
		return userClient.findAllProducts();
	}
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		
		return userClient.addProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		
		return userClient.deleteProduct(id);
	}
	
	@PutMapping("/update")
	public String updateProduct(@RequestBody Product product) {
		return userClient.updateProduct(product);
	}
	
	@GetMapping("/productById/{id}")
	public Product findProductById(@PathVariable int id) {
		return userClient.findProductById(id);
	}
}
