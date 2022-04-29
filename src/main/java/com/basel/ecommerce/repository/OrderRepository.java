package com.basel.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basel.ecommerce.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
