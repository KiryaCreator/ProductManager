package com.skorogod.services.interfaces;

import com.skorogod.entities.Product;
import javassist.NotFoundException;

import java.util.List;

public interface ProductService {

    public Product save(Product product);

    public Product findByIdOrThrow(Long id) throws NotFoundException;

    public List<Product> saveAll(List<Product> products);
}
