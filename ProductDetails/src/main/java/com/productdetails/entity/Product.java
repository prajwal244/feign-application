package com.productdetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Product {

	
	    @Id
	    @GeneratedValue
	    private long id;
	    private String name;
	    private int quantity;
	    private double price;
}
