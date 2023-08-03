package com.workintech.productforsale.main;

import com.workintech.productforsale.product.Bread;
import com.workintech.productforsale.product.Chocolate;
import com.workintech.productforsale.product.Coke;
import com.workintech.productforsale.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Bitter Chocolate",5.0,"Dark chocolate with high cocoa content",100);
        products[1] = new Bread("Brown bread",10,"made from whole wheat flour",1000);
        products[2] = new Coke("Cola Turka",20,"Turkish coke",2000);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
            for(ProductForSale product: products) {
                product.showDetails();
                System.out.println("----------------------------");
            }
    }
}