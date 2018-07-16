package com.acn.manu.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.acn.manu.dto.ResponseCatalog;
import com.acn.manu.service.ProductService;
import com.acn.manu.service.ProductServiceImpl;
import com.sun.mail.iap.Response;



@WebService
public class ProductCatalog {
	
	ProductService productService = new ProductServiceImpl();
	ResponseCatalog responseCatalog = new ResponseCatalog();

	@WebMethod(operationName="Categories")
	public ResponseCatalog getProductsCategories(){
		responseCatalog.setList(productService.getProductsCategories());
		return responseCatalog;
	}
	
	@WebMethod(operationName="Products_Category")
	public ResponseCatalog getProducts(String category){
		if(category.isEmpty()){
			responseCatalog = this.getProductsCatalog();
		}else {
			if ((category.equals("books")) || (!category.equals("music")) || (!category.equals("movies"))) {
				responseCatalog.setMessage("Inserire una delle seguenti categorie: books, music, movies");
		}else 
			responseCatalog.setList(productService.getProducts(category));
		}
		return responseCatalog;
	}
	
	@WebMethod(operationName="All_Products")
	public ResponseCatalog getProductsCatalog(){
		responseCatalog.setList(productService.getAllProducts());
		return responseCatalog;
	}
	
	
}
