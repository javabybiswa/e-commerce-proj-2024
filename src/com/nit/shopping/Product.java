package com.nit.shopping;

public class Product {
	
	    private String id;
	    private String name;
	    private double price;

	    public Product(String id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public String toString() {
	        return "Product [ID=" + id + ", Name=" + name + ", Price=" + price + "]";
	    }
	

}
