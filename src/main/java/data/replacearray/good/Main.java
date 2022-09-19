package main.java.data.replacearray.good;

import main.java.conditionals.polymorphism.good.Product;
import main.java.conditionals.polymorphism.good.ProductBasic;

public class Main {

	public static void main(String[] args) {
		int items = 5;

		ProductColored product = new ProductColored();//change Array for an object
		product.setName("Chair");
		product.setColor("Black");
		product.setPrice(49.99);

		double finalPrice = product.getPrice()* items;
	}
}
