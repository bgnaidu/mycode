package com.naidu.springCore.standaolnecollections;

import java.util.List;

public class ProductList {

	
	private List<String> productnames;

	public List<String> getProductnames() {
		return productnames;
	}

	public void setProductnames(List<String> productnames) {
		this.productnames = productnames;
	}

	@Override
	public String toString() {
		return "ProductList [productnames=" + productnames + "]";
	}
	
}
