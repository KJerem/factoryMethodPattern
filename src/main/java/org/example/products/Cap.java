package org.example.products;

import java.util.HashMap;
import java.util.Map;

public class Cap implements Product{
    private Map<String, Integer> caps = new HashMap<>();
    @Override
    public void display() {
        caps.put("cap1",20);
        caps.put("cap2",30);

        System.out.println("Voici les Caps disponibles :");
        for (Map.Entry<String, Integer> entry : caps.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Clé : " + key + ", Quantité : " + value);
        }
    }
}
