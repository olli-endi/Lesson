package com.endi.lesson_3_2;

import java.util.HashMap;
import java.util.Map;

public class DataBody {

    private int N;
    private Map<String, Integer> day;
    private int[] time;

    public DataBody() {
        this.day = new HashMap<String, Integer>();
        this.time = new int[24];
        N = 0;
    }

    public void addVisit() {
        N++;
    }

    public void addDay(String keyDay) {
        if(!day.containsKey(keyDay)) {
            day.put(keyDay, 1);
        } else {
            day.put(keyDay, day.get(keyDay) + 1);
        }
    }

    public void addTime(String keyTime) {
        String[] args = keyTime.split(":");
        setTime(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }

    public int getN() {
        return N;
    }

    public int[] getTime() {
        return time;
    }

    public Map<String, Integer> getDay() {
        return day;
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
