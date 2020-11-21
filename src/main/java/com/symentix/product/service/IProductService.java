package com.symentix.product.service;

import java.util.List;
import java.util.Optional;

import com.symentix.product.dto.Product;

public interface IProductService {
	List<Product> getAllProducts();

	Optional<Product>getProductById(String pId);

	void addProduct(Product p);

	void updateProduct(Product p, String pId);

	void deleteProduct(String pId);
}

