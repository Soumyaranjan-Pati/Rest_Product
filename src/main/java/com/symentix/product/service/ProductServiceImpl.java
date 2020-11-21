package com.symentix.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symentix.product.dto.Product;
import com.symentix.product.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	IProductRepository repository;
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Product> getProductById(String pId) {
		// TODO Auto-generated method stub
		return repository.findById(pId);
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		repository.save(p);
	}

	@Override
	public void updateProduct(Product p, String pId) {
		// TODO Auto-generated method stub
		repository.save(p);

	}

	@Override
	public void deleteProduct(String pId) {
		// TODO Auto-generated method stub
		repository.deleteById(pId);

	}

}
