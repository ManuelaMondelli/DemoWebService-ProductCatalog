package com.acn.manu.dto;

import java.util.List;

public class ResponseCatalog {
	
	private String message;
	private List<String> list;
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public ResponseCatalog() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
