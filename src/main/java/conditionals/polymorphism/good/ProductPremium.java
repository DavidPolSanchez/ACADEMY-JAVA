package main.java.conditionals.polymorphism.good;

public class ProductPremium extends Product{
    @Override
    protected double calculatePrice() {
        return this.getPrice();
    }
}
