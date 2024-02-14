package com.anupam.springtest;

import java.util.ArrayList;
import java.util.List;

public class SeriesTest {
    public static void main(String[] args) {
        SeriesTest s = new SeriesTest();
        List<Integer> seriesList = s.getSeriesNumber(10);
        System.out.println("getseriesnumber: \n" + seriesList);
        List<Integer> square = s.squareOfNumber(6);
        System.out.println("getseriesnum1: \n" + square);
        List<String>wordCount= s.getWordCount();
        System.out.println("getWordCount : \n" +wordCount);
    }

    public List<Integer> getSeriesNumber(int num) {
        List<Integer> list = new ArrayList<>();
        int a = 2;
        for (int i = 1; i < num; i++) {
            a = a + i * i;
            list.add(a);
        }
        return list;
    }



    public List<Integer> squareOfNumber(int number) {

        List<Integer>list=new ArrayList<>();
   int t=1;

    for(int i=1;i<number;i++){
       t=(number*number*number);
        list.add(t);
    }
   return list;
    }
    public ArrayList getWordCount(){
        ArrayList  list1 = new ArrayList<>();

        list1.add("one");
        list1.add("Two");

        list1.add("Three");
        list1.add("one");
        list1.add("four");
        list1.add("five");
        list1.add("six");
        list1.add("seven");
        list1.add("four");
        list1.add("two");
        list1.add("five");

        for (int i = 0; i < list1.size(); i++) {
            int count = 0;
            for (int j = 0; j < list1.size(); j++) {
                if(list1.get(i).equals(list1.get(j)))
                    count++;
            }
            System.out.println(list1.get(i)+"  " + count + " times");
    }
        return list1;
    }}
