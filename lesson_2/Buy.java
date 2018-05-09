package com.endi.lesson_2;

public class Buy extends Product {

    private int size;
    private int sumPrice;
    private double sumWeight;

//    SET
//
    public void setSize(int size) {
        this.size = size;
        sumPrice = size*getPrice();
        sumWeight = size*getWeight();
    }

//    GET
//
    public int getSize() {
        return size;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public double getSumWeight() {
        return sumWeight;
    }
}
