package com.endi.lesson_3_2;

public class Time {
    private int[] time;

    public Time(String time) {
        this.time = new int[24];
        addTime(time);
    }

    public void addTime(String time) {
        String[] args = time.split(":");
        setTime(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }

    public int[] getTime() {
        return time;
    }
    private void setTime(int hour, int min) {
        if(min < 30) {
            if(hour != 0) {
                time[hour] += 1;
                time[hour-1] += 1;
            } else {
                time[hour] += 1;
                time[23] += 1;
            }
        } else {
            if(hour != 23) {
                time[hour] += 1;
                time[hour+1] += 1;
            } else {
                time[hour] += 1;
                time[0] += 1;
            }
        }
    }
}
