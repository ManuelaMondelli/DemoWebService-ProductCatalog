package com.acn.manu.service;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

	List <String> bookList = new ArrayList<>();
	List <String> musicList = new ArrayList<>();
	List <String> movieList = new ArrayList<>();

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
		switch (category)	{
		case "books":
		return bookList;
		case "music":
		return musicList;
		case "movies":
		return movieList;
		}
		return null;
	}
	
	public List<String> getAllProducts(){
		List<String> allProducts = new ArrayList<>();
		allProducts.addAll(bookList);
		allProducts.addAll(musicList);
		allProducts.addAll(movieList);
		return allProducts;
	}
}
