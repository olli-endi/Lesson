package com.endi.lesson_2;

public class Product {

    private String name;
    private int price;
    private double weight;

//    SET
//
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

//    GET
//
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
