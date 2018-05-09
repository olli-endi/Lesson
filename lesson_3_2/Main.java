package com.endi.lesson_3_2;

import java.io.*;
import java.util.*;

public class Main {

    private final String LOG;
    private Map<String, Body> list;
    private Map<String, Time> time;

    public Main(String LOG) {
        this.LOG = LOG;
        list = new HashMap<String, Body>();
        time = new HashMap<String, Time>();

        initMap();
    }

    public void wtireAll(String file) {
        try {
            Date date = new Date();
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            Set<String> setList = list.keySet();
            for(String ip : setList) {
                System.out.println(printN(ip) + printMaxDay(ip) + printTime(ip));
                bufferWriter.write(printN(ip) + printMaxDay(ip) + printTime(ip) + "\n");
            }

            Set<String> setTime = time.keySet();
            for(String dayTime : setTime) {
                System.out.print(dayTime + " " + printTimeDay(dayTime) + "\n");
                bufferWriter.write(dayTime + " " + printTimeDay(dayTime) + "\n");
            }

            bufferWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String printTimeDay(String dayTime) {

        int[] arrayTime = time.get(dayTime).getTime();

        int maxIndex = 0;
        int maxValue = 0;
        int left = 0;
        int right = 0;

        for(int i = 0; i < 24; i++) {
            if(arrayTime[i] > maxValue) {
                maxIndex = i;
                maxValue = arrayTime[i];

                if(i == 0) {
                    left = 23;
                    right = 1;
                } else if(i == 23) {
                    left = 22;
                    right = 0;
                } else {
                    left = i-1;
                    right = i+1;
                }
            }
        }

        if(right > left) {
            return (maxIndex + "-" + right);
        } else {
            return (left + "-" + maxIndex);
        }

    }

    private String printN(String ip) {
        return (ip + " " + list.get(ip).getN() + " ");
    }

    private String printMaxDay(String ip) {

        Map<String, Integer> mapDay = list.get(ip).getDay();
        Set<String> setDay = mapDay.keySet();

        String maxDay = null;
        int maxN = 0;

        for(String day : setDay) {
            if(mapDay.get(day) > maxN) {
                maxN = mapDay.get(day);
                maxDay = day;
            }
        }

        return (maxDay + " ");
    }

    private String printTime(String ip) {

        int[] time = list.get(ip).getTime();
        int maxIndex = 0;
        int maxValue = 0;
        int left = 0;
        int right = 0;

        for(int i = 0; i < 24; i++) {
            if(time[i] > maxValue) {
                maxIndex = i;
                maxValue = time[i];

                if(i == 0) {
                    left = 23;
                    right = 1;
                } else if(i == 23) {
                    left = 22;
                    right = 0;
                } else {
                    left = i-1;
                    right = i+1;
                }
            }
        }

        if(right > left) {
            return (maxIndex + "-" + right);
        } else {
            return (left + "-" + maxIndex);
        }
    }

    private void initMap() {
        File file = new File(LOG);
        Scanner scan = null;

        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] subStr = str.split(" ");

            String[] temp = subStr[1].split(":");

            System.out.println(temp[0]);
            subStr[1] = temp[0];
            System.out.println(subStr[1]);
//            if (!map.containsKey(subStr[0])) {
//                map.put(subStr[0], new Body(subStr));
//            } else {
//                map.get(subStr[0]).visit(subStr);
//            }
        }
    }
}
