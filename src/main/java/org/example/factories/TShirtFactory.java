package org.example.factories;

import org.example.products.Product;
import org.example.products.TShirt;

public class TShirtFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new TShirt();
    }
}
