package com.microservices.orderservice.api.common;

import com.microservices.orderservice.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TransactionRequest {

	private Order order;
	private Payment payment;
}
