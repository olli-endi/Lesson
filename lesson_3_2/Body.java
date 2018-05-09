package com.endi.lesson_3_2;

public class Body extends DataBody {


    public Body(String time, String day) {
        visit(time, day);
    }

    public void visit(String time, String day) {
        addVisit();
        addTime(time);
        addDay(day);
    }
}
