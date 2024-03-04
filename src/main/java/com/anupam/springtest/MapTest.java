package com.anupam.springtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        MapTest obj = new MapTest();
        Map<String, String> data = obj.getMadData();

        System.out.println("findFamilyCount: "+ obj.findFamilyCount(data));
        System.out.println("findNameByCity: "+ obj.findNameByCity(data, "pune"));
        System.out.println("findNameStartsWithLetter: "+ obj.findNameStartsWithLetter(data, "n"));
        System.out.println("findCountByCity: "+ obj.findCountByCity(data, "muzaffarpur"));
    }

    public List<String> findNameStartsWithLetter(Map<String, String> data, String c) {
        List<String> names= new ArrayList<>();

        for(String s: data.keySet()) {
           if(s.startsWith(c)){
               names.add(s);
           }
        }
        return names;
    }
    public List<String> findNameByCity(Map<String, String> data, String city) {
        List<String> names= new ArrayList<>();
        for(Map.Entry<String, String> entry: data.entrySet()) {
            if(entry.getValue().equals(city)) {
             names.add(entry.getKey());
            }
        }
        return names;
    }
    public int findFamilyCount(Map<String, String> data) {
        int i=0;
        for(String s: data.keySet()) {
            ++i;
        }
        return i;
    }

    public int findCountByCity(Map<String, String> data, String city) {
        int i=0;
        for(String s: data.values()) {
            if(s.equals(city)) {
                ++i;
            }
        }
        return i;
    }

    public Map<String, String> getMadData() {
        Map<String, String> map = new HashMap<>();
        map.put("pankaj", "pune");
        map.put("niraj", "pune");

        map.put("naman", "muzaffarpur");
        map.put("tanu", "muzaffarpur");
        map.put("rekha", "muzaffarpur");

        return map;
    }
}
