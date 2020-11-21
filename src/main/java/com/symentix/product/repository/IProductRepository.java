package com.symentix.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.symentix.product.dto.Product;

@Repository
public interface IProductRepository extends MongoRepository<Product,String>{

}
