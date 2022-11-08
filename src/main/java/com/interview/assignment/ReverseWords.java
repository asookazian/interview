package com.interview.assignment;

//Problem: reverse a String

//e.g. for input "Happy birthday to you": "you to birthday Happy"

import java.util.*;

public class ReverseWords {
	
	public static void main(String[] args) {

		String rtn = reverseWords("Happy birthday to you");

		System.out.println("rtn: " + rtn);
		
	}

	private static String reverseWords(String input) {

		String reversedWords = "";

		StringBuilder sb = new StringBuilder();

		String[] arrOfStr = input.split(" ");

		System.out.println("arrOfStr.length: " + arrOfStr.length);

		String[] newStr = new String[arrOfStr.length];

		List<String> list = Arrays.asList(arrOfStr);

		for(String s : list) {

			System.out.println("s: " + s);
		}

		for(int i = 0; i < arrOfStr.length; i++) {

			sb.append(arrOfStr[ (arrOfStr.length - 1) - i]).append(" ");
		}

		reversedWords = sb.toString();

		System.out.println("reversedWords: " + reversedWords);
		
		return reversedWords;
	}
}