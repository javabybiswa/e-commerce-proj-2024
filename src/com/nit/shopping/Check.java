package com.nit.shopping;

public class Check {
	
	 private Shopping cart;

	    public Check(Shopping cart) {
	        this.cart = cart;
	    }

	    public void processPayment() {
	        double totalAmount = cart.getTotalPrice();
	        // Simulate payment processing
	        System.out.println("Processing payment for amount: $" + totalAmount);
	        // Payment successful
	        System.out.println("Payment successful!");
	        cart.clear();
	    }

}
