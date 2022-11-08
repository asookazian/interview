package com.interview.assignment;

import java.io.*;
import java.util.*;
  
public class HashMapDemo {
    public static void main(String[] args)
    {
  
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Arbi1", 1);
        myMap.put("Barbi1", 2);
        myMap.put("Jen1", 3);
        myMap.put("Zoo1", 3);
        myMap.put("Gary2", 4);

        System.out.println("\nHashMap output (insertion based on hashed keys) ********************************");

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key = " + key);

            System.out.println("value = " + value);

        }

        myMap = new LinkedHashMap<>();

        myMap.put("Arbi1", 1);
        myMap.put("Barbi1", 2);
        myMap.put("Jen1", 3);
        myMap.put("Zoo1", 3);
        myMap.put("Gary2", 4);

        System.out.println("\nLinkedHashMap output (insertion based on literal insertion order in code) ********************************");

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key = " + key);

            System.out.println("value = " + value);

        }

        myMap = new TreeMap<>();

        myMap.put("Arbi1", 1);
        myMap.put("Barbi1", 2);
        myMap.put("Jen1", 3);
        myMap.put("Zoo1", 3);
        myMap.put("Gary2", 4);

        System.out.println("\nTreeMap output (insertion based on sorted keys) ********************************");

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("key = " + key);

            System.out.println("value = " + value);

        }
    }
}