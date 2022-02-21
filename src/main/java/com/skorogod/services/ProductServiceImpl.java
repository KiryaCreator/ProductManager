package com.skorogod.services;

import com.skorogod.entities.Product;
import com.skorogod.repositories.ProductRepository;
import com.skorogod.services.interfaces.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
