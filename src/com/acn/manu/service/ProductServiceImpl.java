package com.acn.manu.service;

import java.util.ArrayList;
import java.util.List;

import com.acn.manu.dto.ResponseCatalog;

public class ProductServiceImpl implements ProductService{

	List <String> bookList = new ArrayList<>();
	List <String> musicList = new ArrayList<>();
	List <String> movieList = new ArrayList<>();
	ResponseCatalog responseCatalog = new ResponseCatalog();

	public ProductServiceImpl() {
		bookList.add("Libro 1");
		bookList.add("Libro 2");
		bookList.add("Libro 3");

		musicList.add("Music 1");
		musicList.add("Music 2");
		musicList.add("Music 3");

		movieList.add("Movie 1");
		movieList.add("Movie 2");
		movieList.add("Movie 3");
	}

	public List<String> getProductsCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

	public List<String> getProducts(String category){
		if(category.equals("books")) {
			responseCatalog.setList(bookList);
		}
		if(category.equals("music")) {
			responseCatalog.setList(musicList);
		}
		if(category.equals("movies")) {
			responseCatalog.setList(movieList);
		}
		return responseCatalog.getList();
	}

	public List<String> getAllProducts(){
		List<String> allProducts = new ArrayList<>();
		allProducts.addAll(bookList);
		allProducts.addAll(musicList);
		allProducts.addAll(movieList);
		return allProducts;
	}

	public ResponseCatalog addProduct(String category, String product){
		if(category.equals("books")) {
			for (String book : bookList) {
				if (book.equals(product)) {
					responseCatalog.setMessage("Il prodotto inserito è già presente");
				}else 
					bookList.add(product);
			}
			responseCatalog.setList(bookList);
		}
		if(category.equals("music")) {
			for (String song : musicList) {
				if (song.equals(product)) {
					responseCatalog.setMessage("Il prodotto inserito è già presente");
				}else 
					musicList.add(product);
			}
			responseCatalog.setList(musicList);
		}
		if(category.equals("movies")) {
			for (String movie : movieList) {
				if (movie.equals(product)) {
					responseCatalog.setMessage("Il prodotto inserito è già presente");
				}else
					movieList.add(product);
			}
			responseCatalog.setList(movieList);
		}
		return responseCatalog;
	}
}
