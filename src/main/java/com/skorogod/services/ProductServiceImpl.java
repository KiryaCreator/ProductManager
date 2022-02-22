package com.skorogod.services;

import com.skorogod.entities.Product;
import com.skorogod.repositories.ProductRepository;
import com.skorogod.services.interfaces.ProductService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findByIdOrThrow(Long id) throws NotFoundException {
        return productRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Product not found"));
    }

    @Override
    public List<Product> saveAll(List<Product> products) {
        return productRepository.saveAll(products);
    }
}
