package com.acn.manu.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.acn.manu.dto.ResponseCatalog;
import com.acn.manu.service.ProductService;
import com.acn.manu.service.ProductServiceImpl;



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
		if(category == null){
			this.getProductsCatalog();
		}else {
			if ((category.equals("books")) || (category.equals("music")) || (category.equals("movies"))) {
				responseCatalog.setList(productService.getProducts(category));
			}else {
				responseCatalog.setMessage("Inserire una delle seguenti categorie: books, music, movies");
			}
		}
		return responseCatalog;
	}

	@WebMethod(operationName="All_Products")
	public ResponseCatalog getProductsCatalog(){
		responseCatalog.setList(productService.getAllProducts());
		return responseCatalog;
	}

	@WebMethod(operationName="Add_Product")
	public ResponseCatalog addProduct(String category, String product) {
		if(category == null){
			responseCatalog.setMessage("Inserire una delle seguenti categorie: books, music, movies");
		}else{
			if ((category.equals("books")) || (category.equals("music")) || (category.equals("movies"))) {
				if (product == null) {
					responseCatalog.setMessage("Inserire il prodotto da aggiungere");
				}else {
					productService.addProduct(category, product);
				}
			}else
				responseCatalog.setMessage("Inserire una delle seguenti categorie: books, music, movies");		
			}
		return responseCatalog;	
	}

}
