package org.example;

import org.example.factories.CapFactory;
import org.example.factories.ProductFactory;
import org.example.factories.TShirtFactory;
import org.example.products.Cap;
import org.example.products.TShirt;

public class Main {


    public static void main(String[] args) {
        ProductFactory tsfactory;
        ProductFactory cpfactory;

        tsfactory = new TShirtFactory();
        cpfactory = new CapFactory();

        TShirt shirts = (TShirt) tsfactory.createProduct();
        Cap caps = (Cap) cpfactory.createProduct();

        shirts.display();
        caps.display();
    }
}