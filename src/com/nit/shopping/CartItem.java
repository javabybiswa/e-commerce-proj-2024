package com.nit.shopping;

public class CartItem {
	
	  private Product product;
	  private int quantity;

	    public CartItem(Product product, int quantity) {
	        this.product = product;
	        this.quantity = quantity;
	    }

	    public Product getProduct() {
	        return product;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public double getTotalPrice() {
	        return product.getPrice() * quantity;
	    }

	    public void increaseQuantity(int amount) {
	        this.quantity += amount;
	    }

	    public void decreaseQuantity(int amount) {
	        this.quantity -= amount;
	    }

	    @Override
	    public String toString() {
	        return "CartItem [Product=" + product + ", Quantity=" + quantity + ", TotalPrice=" + getTotalPrice() + "]";
	    }

}
