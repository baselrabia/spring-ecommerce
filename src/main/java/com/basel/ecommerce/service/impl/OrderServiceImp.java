package com.basel.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.basel.ecommerce.model.Order;
import com.basel.ecommerce.repository.OrderRepository;
import com.basel.ecommerce.service.OrderService;

@Service
@Transactional
public class OrderServiceImp implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }
	
    @Override
    public Order create(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }

	

}
