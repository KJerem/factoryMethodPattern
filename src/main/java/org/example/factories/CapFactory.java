package org.example.factories;

import org.example.products.Cap;
import org.example.products.Product;

public class CapFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new Cap();
    }
}
