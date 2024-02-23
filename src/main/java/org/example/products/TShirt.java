package org.example.products;

import java.util.HashMap;
import java.util.Map;

public class TShirt implements Product{
    private Map<String, Integer> tshirts = new HashMap<>();
    @Override
    public void display() {
        tshirts.put("shirt1",20);
        tshirts.put("shirt2",30);


        System.out.println("Voici les TShirts disponibles :");
        for (Map.Entry<String, Integer> entry : tshirts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Clé : " + key + ", Quantité : " + value);
        }
    }

}
