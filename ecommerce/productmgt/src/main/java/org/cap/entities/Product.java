package org.cap.entities;

import java.util.Objects;

public class Product {

    private String productId;
    private double productPrice;
    private String productName;
    private int count;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(productId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || getClass()!=obj.getClass())	
			return false;
		Product prod = (Product)obj;
		return productId.equals(prod.productId);
	}
    
}
