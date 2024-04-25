package edu.icet.foodcrm.service;

import edu.icet.foodcrm.model.Product;

import java.util.List;

public interface ProductService {

    void saveProduct(Product product);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);
}