package com.microservices.orderservice.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.orderservice.api.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
