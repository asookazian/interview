package com.interview.assignment;

// class A is implementing Runnable interface and its run() method

import java.util.*;

public class RunnableA implements Runnable {

	//run() is synchronized, i.e. synchronized run of multiple threads,
	// A thread executing run() is not replaced by another thread
	//synchronized public void run() {
	public void run() {

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

		for(int i=0; i < 3; i++) {

			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String... ar) {

		RunnableA ob = new RunnableA();

		Thread t1= new Thread(ob,"ThreadA");
		Thread t2= new Thread(ob,"ThreadB");
		Thread t3= new Thread(ob,"ThreadC");	 //Calling Thread's constructor & passing the object of
							 //A class that  implemented  Runnable interface &
							 //the name of new thread.

		t1.start();
		t2.start();
		t3.start();
	}
}