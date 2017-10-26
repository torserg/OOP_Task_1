package com.company;


public class Belt extends Product{
    public Belt(String name, double price, double length, String material) {
        super(name, price);
        this.length = length;
        this.material = material;
    }

    private double length;
    private String  material;

    public Belt() {}

    public double getLength() {return length;}

    public void setLength(double length){this.length = length;}

    public String getMaterial() {return material;}

    public void setMaterial(String material) {this.material = material;}

    @Override
    public String toString() {
        return "Name: " + name + "; " + "price: " + price + "UAH; " + "Length: " + length + "m; " + "Material: " + material + "\n";
    }
}
