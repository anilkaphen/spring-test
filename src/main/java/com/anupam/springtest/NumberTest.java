package com.anupam.springtest;

import java.util.ArrayList;
import java.util.List;

public class NumberTest {

    public static void main(String[] args) {
        NumberTest numberTest = new NumberTest();
        List<Integer> list = numberTest.getArrayList();
        System.out.println("getArrayList :" + list);
        int avg = numberTest.getAvg(list);
        System.out.println(" getAvgList:" + avg);
        List<Integer> list2 = numberTest.getAvgNumGreater(list);
        System.out.println("getAvgNumgreater:" + list2);
        List<Integer> list3 = numberTest.getAvgNumSmallar(list);
        System.out.println("getAvgNumgreater:" + list3);
        int list4 = numberTest.getNumberMax(list);
        System.out.println("getNumberMax:" + list4);
        int list5 = numberTest.getNumberMin(list);
        System.out.println("getNumberMin:" + list5);


    }

    public List<Integer> getArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        return list;
    }

    public int getAvg(List<Integer> list) {
        int sum = 0, avg = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        avg = sum / list.size();
        return avg;
    }

    public List<Integer> getAvgNumGreater(List<Integer> list) {
        int sum = 0, avg = getAvg(list);
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (avg > list.get(i)) {
                list2.add(list.get(i));

            }
        }
        return list2;
    }

    public List<Integer> getAvgNumSmallar(List<Integer> list) {
        int sum = 0, avg = getAvg(list);
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (avg < list.get(i)) {
                list3.add(list.get(i));

            }

        }
        return list3;
    }

    public int getNumberMax(List<Integer> list) {
        List<Integer> list5 = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public int getNumberMin(List<Integer> list) {
        List<Integer> list6 = new ArrayList<>();
        int min = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;


    }
}