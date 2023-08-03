package com.workintech.productforsale.product;

public class Chocolate extends ProductForSale{
    private int weight;

    public Chocolate(String type, double price, String description, int weight) {
        super(type, price, description);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void showDetails() {
        System.out.println("Product Type: "+ getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: "+ getDescription());
        System.out.println("Chocolate Weight: "+ getWeight());
    }
}
