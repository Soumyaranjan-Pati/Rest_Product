package com.symentix.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.symentix.product.dto.Product;
import com.symentix.product.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService serviceRef;
	
	@RequestMapping("/products")
	public List<Product>getAllProducts(){
		return serviceRef.getAllProducts();
	}
	
	@RequestMapping("/products/{pId}")
	public Optional<Product> getProductById(@PathVariable String pId){
		return serviceRef.getProductById(pId);
	}

	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void addProduct(@RequestBody Product p) {
		 serviceRef.addProduct(p);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/products/{pId}")
	public void updateProduct(@RequestBody Product p,@PathVariable String pId) {
		serviceRef.updateProduct(p,pId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{pId}")
		public void deleteProduct(@PathVariable String pId) {
			serviceRef.deleteProduct(pId);
		}
	
}
