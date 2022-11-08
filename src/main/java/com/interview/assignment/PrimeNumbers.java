package com.interview.assignment;

//Problem: passed an int to indicate the number of prime numbers
//starting from 2 to return as  List

//e.g. for input 7: 2, 3, 5, 7, 11, 13, 17

import java.util.*;

public class PrimeNumbers {
	
	public static void main(String[] args) {

		List<Integer> rtn = generatePrimeNumbers(7);

		for(int i = 0; i < rtn.size(); i++) {

			System.out.println("rtn[" + i + "]: " + rtn.get(i));
		}
		
	}

	private static List<Integer> generatePrimeNumbers(int size) {

		List<Integer> primes = new ArrayList<>();

		int counter = 0;

		while(primes.size() < size) {

			if(isPrime(2 + counter)) {

				primes.add(2 + counter);
			}

			counter++;
		}

		return primes;
	}

	private static boolean isPrime(int num) {

		//e.g. num == 4
		for(int i = 2; i <= num; i++) {

			if(num%i == 0 && num != i) {

				return false;
			}
		}

		return true;	
	}
}