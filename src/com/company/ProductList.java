package com.company;


import java.util.stream.Stream;

public interface ProductList {
    void add (Product product);
    int count();
    Product get(int index);
    void sortByPrice();
    void printProduct();
    Stream<Product> getStream();
}
