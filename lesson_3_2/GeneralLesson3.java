package com.endi.lesson_3_2;

import java.io.File;
import java.io.IOException;

public class GeneralLesson3 {
    public static void main(String[] args) {
        Main main = new Main("/home/endi/DB/lesson_3.db");

        File file = new File("/home/endi/DB/lesson_3.out");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        main.wtireAll("/home/endi/DB/lesson_3.out");
    }
}

