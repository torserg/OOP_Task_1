package com.company;


import java.util.OptionalDouble;

public class ProductAVR {
    public static double avrPrice(ProductList products) {
        if (products == null) {
            return 0;
        }
        OptionalDouble average = products.getStream().mapToDouble(p -> p.getPrice()).average();
        return average.isPresent() ? average.getAsDouble() : 0;


    }
}
