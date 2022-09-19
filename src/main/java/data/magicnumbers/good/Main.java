package main.java.data.magicnumbers.good;

public class Main {
    static final double MIN_PRICE_DISCOUNT_CONSTANT = 100;
    static final double FULL_PRICE_SHIPP_CONSTANT = 4.99;
    static final double OFFER_PRICE_SHIPP_CONSTANT = 0;
    static final double DISCOUNT_CONSTANT = 0.1;

    public static void main(String[] args) {
        double price = 129.99;


        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
    	return price < MIN_PRICE_DISCOUNT_CONSTANT ? FULL_PRICE_SHIPP_CONSTANT : OFFER_PRICE_SHIPP_CONSTANT; // CONSTANTS
        
    }

    private static double calculateDiscount(double price) {
        return price * DISCOUNT_CONSTANT;
    }// CONSTANTS
}
