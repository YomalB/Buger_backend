package edu.icet.foodcrm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.foodcrm.entity.ProductEntity;
import edu.icet.foodcrm.model.Product;
import edu.icet.foodcrm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


     @Autowired
     ProductRepository repository;

     @Autowired
     ObjectMapper mapper;

     public void saveProduct(Product product){

          ProductEntity entity
                  = mapper.convertValue(product, ProductEntity.class);

          repository.save(entity);
     }


     public List<Product> getAllProducts(){
          Iterable<ProductEntity> allProducts = repository.findAll();

          List<Product> products = new ArrayList<>();

          allProducts.forEach(productEntity -> {
               Product product = mapper.convertValue(productEntity, Product.class);
               products.add(product);
          });

          return products;

     }

     public List<Product> getProductsByCategory(String category){

          Iterable<ProductEntity> allByCategory = repository.findAllByCategory(category);

          List<Product> products = new ArrayList<>();

          allByCategory.forEach(productEntity -> {
               Product product = mapper.convertValue(productEntity, Product.class);
               products.add(product);
          });

          return products;
     }
}