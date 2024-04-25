package edu.icet.foodcrm.controller;

import edu.icet.foodcrm.model.Product;
import edu.icet.foodcrm.service.ProductService;
import edu.icet.foodcrm.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/products")
    void saveProduct(@RequestBody Product product){
        service.saveProduct(product);
    }

    @GetMapping("/all-products")
    List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/products-by-category/{category}")
    List<Product> getAllProductsByCategory(@PathVariable String category){
        return  service.getProductsByCategory(category);
    }
}