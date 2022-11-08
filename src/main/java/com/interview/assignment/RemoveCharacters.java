package com.interview.assignment;

//Problem: remove specified characters from a string

public class RemoveCharacters {
	
	public static void main(String[] args) {

		String rtn = removeChars("Battle of the Vowels: Hawaii vs. Grozny", "aeiou");

		System.out.println("rtn: " + rtn);
	}

	private static String removeChars(String str, String remove) {

		char[] s = str.toCharArray();
		char[] r = remove.toCharArray();

		int src, dst = 0;

		//set array size to 128 for ASCII chars limit/size
		boolean[] flags = new boolean[128];

		//add all removeable characters as true to boolean flags array
		for(src = 0; src < r.length; ++src) {

			System.out.println("r[" + src + "]: " + r[src]);
			flags[r[src]] = true;
		}

		//add all chars in the original String if the char is not in the flags array
		for(src = 0; src < s.length; ++src) {

			System.out.println("s[" + src + "]: " + s[src]);

			if(!flags[s[src]]) {
				s[dst++] = s[src];
			}
		}

		System.out.println("original string size: " + s.length);
		System.out.println("dst: " + dst);

		return new String(s, 0, dst);
	}
}