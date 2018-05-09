package com.endi.lesson_2;

public class General {
    public static void main(String[] args) {

        Check product = new Check();

        product.setName("Apple");
        product.setPrice(7);
        product.setWeight(0.08);
        product.setSize(30);

        product.showCheck();

    }
}
