package com.interview.assignment;

//Problem: reverse a String

//e.g. for input "Happy birthday to you": "uoy ot yadhtrib yppaH"

import java.util.*;

public class ReverseString {
	
	public static void main(String[] args) {

		String rtn = reverseString("Happy birthday to you");

		System.out.println("rtn: " + rtn);
		
	}

	private static String reverseString(String input) {

		String reversedString = "";

		char[] chars = input.toCharArray();

		char[] reverseChars = new char[chars.length];

		System.out.println("chars.length: " + chars.length);

		int counter = 0;

		for(int i = 0; i < chars.length; i++) {

			System.out.println("chars[ (chars.length - 1) - i]: " + chars[ (chars.length - 1) - i]);

			reverseChars[counter] = chars[ (chars.length - 1) - i];

			counter++;
		}

		reversedString = new String(reverseChars);

		System.out.println("reversedString: " + reversedString);
		
		return reversedString;
	}
}