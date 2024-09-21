package org.akwad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(3); // Create a cart with capacity for 3 items

        // Add items to the cart
        cart.addToCart(new Item("Laptop", 1200.00));
        cart.addToCart(new Item("Headphones", 150.00));
        cart.addToCart(new Item("Mouse", 50.00));

        // Apply a discount of 10%
        cart.applyDiscount(10);

        // Display the total price after applying the discount
        System.out.println("Total price after discount: $" + cart.calculateTotalPrice());
    }
}