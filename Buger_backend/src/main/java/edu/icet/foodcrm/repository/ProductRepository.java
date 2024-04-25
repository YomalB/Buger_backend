package edu.icet.foodcrm.repository;

import edu.icet.foodcrm.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {

    Iterable<ProductEntity> findAllByCategory(String category);
}