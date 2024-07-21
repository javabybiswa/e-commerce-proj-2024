package com.nit.shopping;

import java.util.ArrayList;
import java.util.List;

public class Shopping {
	
	private List<CartItem> items;

    public Shopping() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeProduct(String productId) {
        items.removeIf(item -> item.getProduct().getId().equals(productId));
    }

    public List<CartItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void clear() {
        items.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (CartItem item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

}
