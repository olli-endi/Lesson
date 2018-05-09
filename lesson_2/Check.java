package com.endi.lesson_2;

public class Check extends Buy {

//    SHOW
//
    public void showCheck() {
        System.out.println("Товар:");
        System.out.println("\tНазвание: \"" + getName() + "\"");
        System.out.println("\tЦена за штуку: " + getPrice());
        System.out.println("\tВес: " + getWeight());
        System.out.println("Покупка:");
        System.out.println("\tКоличество: " + getSize());
        System.out.println("\tОбщая цена: " + getSumPrice());
        System.out.println("\tОбщий вес: " + getSumWeight());
    }
}
