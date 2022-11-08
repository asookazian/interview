package com.interview.assignment;

// Java program to demonstrate
// HashMap and HashTable
import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main"
// only if the class is public
public class HashMapHashTable
{
	public static void main(String args[])
	{
		//----------hashtable -------------------------
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101," ajay");
		ht.put(101,"Vijay");
		ht.put(102,"Ravi");
		ht.put(103,"Rahul");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		//----------------hashmap <Integer, String>--------------------------------
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100,"Amit");
		hm.put(104,"Amit");
		hm.put(101,"Vijay");
		hm.put(102,"Rahul");
		System.out.println("-----------Hash map <Integer, String>-----------");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		//----------------hashmap <String, String>--------------------------------
		Map<String,String> hm2 = new HashMap<String,String>();
		hm2.put("Orange","Amit");
		hm2.put("Apple","Amit");
		hm2.put("Nectarine","Vijay");
		hm2.put("Pineapple","Rahul");
		System.out.println("-----------Hash map <String, String>-----------");
		for (Map.Entry m : hm2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		//----------------linkedhashmap <String, String>--------------------------------
		Map<String,String> hm3 = new LinkedHashMap<String,String>();
		hm3.put("Orange","Amit");
		hm3.put("Apple","Amit");
		hm3.put("Nectarine","Vijay");
		hm3.put("Pineapple","Rahul");
		System.out.println("-----------linkedhashmap <String, String>-----------");
		for (Map.Entry m : hm3.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Map<Integer, String> map = new HashMap<>();

		for (int i = 1; i < 10; i++) {
		    map.put(Integer.valueOf(i), "string" + i);
		}

		for (int i = 1; i < 10; i++) {
		    System.out.println("key: " + i + " value: " + map.get(i));
		}
	}
}
