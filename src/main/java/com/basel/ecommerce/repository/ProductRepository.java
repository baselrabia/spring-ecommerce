package com.basel.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basel.ecommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
