package com.company;


public class T_Shirt extends Product{
    public T_Shirt(String name, double price, String color, char size) {
        super(name, price);
        this.color = color;
        this.size = size;
    }

    private String color;
    private char size;

    public T_Shirt() {}

    public String getColor() {return color;}

    public void setColor(String color){this.color = color;}

    public char getSize() {return size;}

    public void setSize(char size) {this.size = size;}

    @Override
    public String toString() {
        return "Name: " + name + "; " + "price: " + price + "UAH; " + "Color: " + color + "; " + "Size: " + size + "\n";
    }
}
