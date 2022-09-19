package main.java.conditionals.polymorphism.good;

public class ProductBasic extends Product{
    @Override
    protected double calculatePrice() {
        return this.getPrice() + SHIPPING;
    }
}
