package org.cap.service;

import org.cap.entities.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);

    List<Product> fetchAll();

    Product findById(String id);
}
