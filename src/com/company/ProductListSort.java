package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ProductListSort implements ProductList{
    private ArrayList<Product> products;
    public ProductListSort() {products = new ArrayList<>();}

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public int count() {
        return products.size();
    }

    @Override
    public Product get(int index) {
        return products.get(index);
    }

    @Override
    public void sortByPrice() {
    products.sort((p1, p2) -> {
        if (p1.getPrice() == p2.getPrice()) {
            return 0;
        }else {
            return p1.getPrice() < p2.getPrice() ? -1 : 1;
        }
    });
    }

    @Override
    public void printProduct() {products.stream().forEach(System.out::println);

    }

    @Override
    public Stream<Product> getStream() {
        return products.stream();
    }
}
