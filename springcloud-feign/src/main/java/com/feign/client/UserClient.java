package com.feign.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feign.dto.Product;


@FeignClient("PRODCUT-DETAILS")
public interface UserClient {

	@RequestMapping("/products")
	List findAllProducts();
	
	@PostMapping("/addProduct")
	String addProduct( Product product);
	
	@DeleteMapping("/delete/{id}")
	String deleteProduct(@PathVariable int id);
	
	@PutMapping("/update")
	String updateProduct(Product product);
	
	@GetMapping("/productById/{id}")
	Product findProductById(@PathVariable int id);
}
