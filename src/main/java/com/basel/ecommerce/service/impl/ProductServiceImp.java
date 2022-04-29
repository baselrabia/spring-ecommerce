package com.basel.ecommerce.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.basel.ecommerce.dto.OrderProductDto;
import com.basel.ecommerce.exception.ResourceNotFoundException;
import com.basel.ecommerce.model.Product;
import com.basel.ecommerce.repository.ProductRepository;
import com.basel.ecommerce.service.ProductService;

@Service
@Transactional
public class ProductServiceImp implements ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImp.class);

	@Autowired
	private ProductRepository productRepository;


}
