package com.nit.shopping;

import java.util.Scanner;

public class ShoppingMain {

		
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Shopping cart = new Shopping();

		        Product product1 = new Product("1", "Laptop", 999.99);
		        Product product2 = new Product("2", "Smartphone", 499.99);
		        Product product3 = new Product("3", "Tablet", 299.99);
		        Product product4 = new Product("4", "SmartWatch", 350.99);

		        while (true) {
		            System.out.println("\n1. List Products");
		            System.out.println("2. Add Product to Cart");
		            System.out.println("3. View Cart");
		            System.out.println("4. Remove Product from Cart");
		            System.out.println("5. Checkout");
		            System.out.println("6. Exit");

		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println(product1);
		                    System.out.println(product2);
		                    System.out.println(product3);
		                    break;
		                case 2:
		                    System.out.println("Enter product ID to add:");
		                    String productId = scanner.next();
		                    System.out.println("Enter quantity:");
		                    int quantity = scanner.nextInt();
		                    if (productId.equals(product1.getId())) {
		                        cart.addProduct(product1, quantity);
		                    } else if (productId.equals(product2.getId())) {
		                        cart.addProduct(product2, quantity);
		                    } else if (productId.equals(product3.getId())) {
		                        cart.addProduct(product3, quantity);
		                    } else {
		                        System.out.println("Product not found.");
		                    }
		                    break;
		                case 3:
		                    System.out.println("Cart contents:");
		                    System.out.println(cart);
		                    break;
		                case 4:
		                    System.out.println("Enter product ID to remove:");
		                    String removeId = scanner.next();
		                    cart.removeProduct(removeId);
		                    break;
		                case 5:
		                    Check checkout = new Check(cart);
		                    checkout.processPayment();
		                    break;
		                case 6:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice.");
		            }
		        }
		    }
	
}
