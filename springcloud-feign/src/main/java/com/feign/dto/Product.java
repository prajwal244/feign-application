package com.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	
	
	    private long id;
	    private String name;
	    private int quantity;
	    private double price;
}
