package com.acn.manu.service;

import java.util.List;

public interface ProductService {
	
	public List<String> getProductsCategories();

	public List<String> getProducts(String category);
	
	public List<String> getAllProducts();
}
