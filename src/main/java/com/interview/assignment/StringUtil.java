package com.interview.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Requirement:
 * 
 * Sherlock considers a string to be valid if all characters of the string appear 
 * the same number of times. It is also valid if he can remove just 1 character at 1 
 * index in the string, and the remaining characters will occur the same number of times. 
 * Given a string , determine if it is valid. If so, return YES, otherwise return NO.
 * 
 * Example

s = abc

This is a valid string because frequencies are .

s = abcc

This is a valid string because we can remove one  and have  of each character in the remaining string.

s = abccc

This string is not valid as we can only remove  occurrence of . That leaves character frequencies of .
 * 
 * @author arbi
 *
 */
public class StringUtil {

	public static void main(String[] args) {
		
		System.out.println("********************* in StringUtil.main **************************");
		
		String isValid1 = isValid("abcdefghhgfedecba");
		
		System.out.println("********************* isValid1: " + isValid1 + "**************************");
		
		String isValid2 = isValid("abccc");
		
		System.out.println("********************* isValid2: " + isValid2 + "**************************");
		
		String isValid3 = isValid("aaabbbcccdddeee");
		
		System.out.println("********************* isValid3: " + isValid3 + "**************************");
		
	}
	
	//input: abcdefghhgfedecba
	//valid == true
	//input: abccc
	//valid == false
	//input: abbbcd
	//valid == false
	//input: aabbcd
	//valid == false
	public static String isValid(final String s) {
		
		System.out.println("********************* isValid() input string: " + s + "**************************");
		
		char[] chars = s.toCharArray();
		
		System.out.println("********************* chars.length: " + chars.length + "**************************");
		
		Map<Character, Integer> map = new TreeMap<>();
		
		//load map
		for(int i = 0; i < chars.length; i++) {
				
			Integer val = map.get(chars[i]);
			if (val == null) {
				map.put(chars[i], 1);
			}
			else {
				map.put(chars[i], val + 1);
			}
		}
		
		int maxValue = Collections.max(map.values());		
		int minValue = Collections.min(map.values());
		
		System.out.println("************************ minValue: " + minValue + "***************************");
		System.out.println("************************ maxValue: " + maxValue + "***************************");
		
		int counter = 0;
		
		//evaluate map (increment counter to handle scenario where a character shows up same # of times as another character as max value)
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println("************************ entry.getKey(): " + entry.getKey() + " entry.getValue(): " + entry.getValue() + "***************************");
			
			if( maxValue > minValue && entry.getValue() == maxValue) {
				
				counter++;
			}
		}
		
		System.out.println("************************ counter: " + counter + "***************************");
        
		if( (maxValue - minValue > 1) || counter > 1) {
			System.out.println("************************ invalid ***************************");
			return "NO";
		}
		else {
			System.out.println("************************ valid ***************************");
			return "YES";
		}	
		
	}

}
