package com.basel.ecommerce.service;

import com.basel.ecommerce.model.Order;

public interface OrderService {

	public Iterable<Order> getAllOrders();
	public Order create(Order order);
	public void update(Order order);
}
