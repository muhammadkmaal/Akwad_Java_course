package org.akwad;

public class ShoppingCart {
    private Item[] items;
    private int index;
    private double totalPrice;
    private double discount;

    public ShoppingCart(int capacity) {
        this.items = new Item[capacity]; // Static array with a fixed size
        this.index = 0;
        this.totalPrice = 0;
        this.discount = 0;
    }

    // Method to add an item to the cart
    public void addToCart(Item item) {
        if (index < items.length) {
            items[index] = item;
            index++;
            totalPrice += item.getPrice();
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // Method to calculate the total price after applying any discount
    public double calculateTotalPrice() {
        return totalPrice - (totalPrice * discount);
    }

    // Method to apply a discount to the total price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            this.discount = discountPercentage / 100;
        } else {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
        }
    }

    // Getter for total price (read-only)
    public double getTotalPrice() {
        return totalPrice;
    }
}
