package com.interview.assignment;

import java.math.BigInteger;

/*

In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. The factorial of n also equals the product of n with the next smaller factorial: For example, The value of 0! is 1, according to the convention for an empty product. Wikipedia
n! = n * (n-1) * ... * 1

*/
public class Factorial {
	
	public static void main(String[] args) throws Exception {
		
		long start = java.lang.System.currentTimeMillis();

		long rtn = multiplyNumbers(5);
		
		long finish = java.lang.System.currentTimeMillis();
		
		System.out.println("multiplyNumbers time to exec in ms: " + (finish - start));

		System.out.println("rtn = " + rtn);
		
		start = java.lang.System.currentTimeMillis();

		BigInteger rtn2 = calculateFactorial(5);
		
		finish = java.lang.System.currentTimeMillis();
		
		System.out.println("calculateFactorial time to exec in ms: " + (finish - start));

		System.out.println("rtn2 = " + rtn2);
	}

	private static BigInteger multiplyNumbersBigInteger(long num) {

		//System.out.println("in multiplyNumbers: num = " + num);
		
		BigInteger factorial = BigInteger.valueOf(num);

        if (num >= 1) {

        	factorial = factorial.multiply(BigInteger.valueOf(num - 1));
        	//System.out.println("in multiplyNumbers: myRtn = " + myRtn);
            return factorial;
        }
        else {
            return BigInteger.ONE;
        }
    }
	
	private static long multiplyNumbers(long num) {

		//System.out.println("in multiplyNumbers: num = " + num);
		
		long factorial = num;

        if (num >= 1) {

        	factorial = factorial * multiplyNumbers(num - 1);
        	//System.out.println("in multiplyNumbers: myRtn = " + myRtn);
            return factorial;
        }
        else {
            return 1;
        }
    }

	private static BigInteger calculateFactorial(Integer base) {

		//5! = 5 * 4 * 3 * 2 * 1 = 120

		BigInteger factorial = BigInteger.valueOf(base);

		for(int i = base - 1; i > 1; i--) {

			//System.out.println("i = " + i);

			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		return factorial;
	}
}
