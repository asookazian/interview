//Problem: find first non-repeated character

//e.g. for input "total": "o"; "teeter": "r"

package com.interview.assignment;

import java.util.*;

public class FindFirstNonRepeatedChar {
	
	public static void main(String[] args) throws Exception {

		char rtn = findFirstNonRepeatedCharOptimized("teeterz");

		System.out.println("rtn: teeterz: " + rtn);

		rtn = findFirstNonRepeatedCharOptimized("total");

		System.out.println("rtn: total: " + rtn);

		rtn = findFirstNonRepeatedCharOptimized("garbage");

		System.out.println("rtn: garbage: " + rtn);
		
	}

	private static char findFirstNonRepeatedChar(String input) throws Exception {

		//Strategy 1) store data in a Map with key as char and value as number of occurrences

		Map<Character, Integer> map = new LinkedHashMap<>();

		char[] chars = input.toCharArray();

		for(int i = 0; i < chars.length; i++) {

			map.put(chars[i], map.get(chars[i]) == null ? 1 :  map.get(chars[i]) + 1);
		}

		//expect: 't', 2; 'e', 3; 'r', 1

		for(Map.Entry<Character, Integer> entry : map.entrySet()) {

			if(entry.getValue() == 1) {

				return entry.getKey();
			}
		}

		throw new Exception("unable to find non-repeating character in input " + input);

	}

	private static char findFirstNonRepeatedCharOptimized(String input) throws Exception {

		//Strategy 1) store data in a Map with key as char and value as number of occurrences

		Map<Character, Object> map = new LinkedHashMap<>();

		Object seenOnce = new Object();
		Object seenMoreThanOnce = new Object();

		char[] chars = input.toCharArray();

		for(int i = 0; i < chars.length; i++) {

			map.put(chars[i], map.get(chars[i]) == null ? seenOnce : seenMoreThanOnce);
		}

		//expect: 't', 2; 'e', 3; 'r', 1

		for(Map.Entry<Character, Object> entry : map.entrySet()) {

			if(entry.getValue() == seenOnce) {

				return entry.getKey();
			}
		}

		throw new Exception("unable to find non-repeating character in input " + input);

	}
}