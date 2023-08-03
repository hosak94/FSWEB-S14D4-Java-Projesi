package com.workintech.productforsale.product;

public class Bread extends ProductForSale{
    private int quantity;

    public Bread(String type, double price, String description, int quantity) {
        super(type, price, description);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Quantity: "+getQuantity());
    }
}
