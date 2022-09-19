package main.java.data.replacearray.good;

import main.java.conditionals.polymorphism.good.Product;

public class ProductColored extends Product {
    private String color ;
    void setColor(String color) {
        this.color = color;
    }

    private String getColor() {
        return this.color;
    }


    @Override
    protected double calculatePrice() {
        return this.getPrice();
    }
}
