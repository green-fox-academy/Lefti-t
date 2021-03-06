package com.greenfoxacademy.webshop.models;

public class ShopItems {

    protected String name;
    protected String description;
    protected double price;
    protected int quantityOfStock;


    public ShopItems(String name, String description, double price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price ;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }
}
