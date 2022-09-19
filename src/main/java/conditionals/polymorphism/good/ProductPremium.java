package main.java.conditionals.polymorphism.good;

public class ProductPremium extends Product{
    @Override
    double calculatePrice() {
        return this.getPrice();
    }
}
