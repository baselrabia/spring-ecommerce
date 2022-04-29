package com.basel.ecommerce.service;

import java.util.List;

import com.basel.ecommerce.dto.OrderProductDto;
import com.basel.ecommerce.model.Product;

public interface ProductService {
	
	public Iterable<Product> getProducts();
	public Product getProduct(long id);
	public Product save(Product product);
	public void validateProductsAvailability(List<OrderProductDto> orderProducts);

}
