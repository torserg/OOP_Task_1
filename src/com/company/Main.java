package com.company;

import com.company.ProductAVR;
import com.company.T_Shirt;
import com.company.Belt;
import com.company.ProductList;
import com.company.ProductListSort;

public class Main {

    public static void main(String[] args) {

    T_Shirt tShirt1 = new T_Shirt("Next", 320.0, "green", 'M');
    T_Shirt tShirt2 = new T_Shirt("Adidas", 520.0, "blue", 'L');
    T_Shirt tShirt3 = new T_Shirt("Nike", 430.0, "grey", 'S');

    Belt belt1 = new Belt("Next", 250.0, 1.5, "coton");
    Belt belt2 = new Belt("Voronin", 1050.0, 1.3, "leather");
    Belt belt3 = new Belt("Diesel", 850.0, 1.2, "leather");

    ProductList products = new ProductListSort();

    products.add(tShirt1);
    products.add(tShirt2);
    products.add(tShirt3);
    products.add(belt1);
    products.add(belt2);
    products.add(belt3);

        System.out.println("Список товаров:");
        products.printProduct();

        products.sortByPrice();

        System.out.println("Список товаров после сортировки:");
        products.printProduct();

        System.out.printf("Средняя цена товаров:", ProductAVR.avrPrice(products));
    }
}
