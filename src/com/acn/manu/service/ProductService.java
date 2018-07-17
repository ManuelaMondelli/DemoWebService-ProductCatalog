package com.acn.manu.service;

import java.util.List;

import com.acn.manu.dto.ResponseCatalog;

public interface ProductService {

	public List<String> getProductsCategories();

	public List<String> getProducts(String category);

	public List<String> getAllProducts();

	public ResponseCatalog addProduct(String category, String product);
}
