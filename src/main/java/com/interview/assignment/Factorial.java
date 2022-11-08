package com.interview.assignment;

/*

In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. The factorial of n also equals the product of n with the next smaller factorial: For example, The value of 0! is 1, according to the convention for an empty product. Wikipedia
n! = n * (n-1) * ... * 1

*/
public class Factorial {
	
	public static void main(String[] args) throws Exception {

		long rtn = multiplyNumbers(5);

		System.out.println("rtn = " + rtn);
	}

	private static long multiplyNumbers(int num) {

		System.out.println("in multiplyNumbers: num = " + num);

        if (num >= 1) {

        	long myRtn = num * multiplyNumbers(num - 1);
        	System.out.println("in multiplyNumbers: myRtn = " + myRtn);
            return myRtn;
        }
        else {
            return 1;
        }
    }

	private static int calculateFactorial(int base) {

		//5! = 5 * 4 * 3 * 2 * 1 = 120

		int rtn = base;

		for(int i = base - 1; i > 1; i--) {

			System.out.println("i = " + i);

			//rtn = calculateFactorial(rtn*i);  //5 * 4, 20 * 3

			rtn = rtn * i;
		}

		return rtn;
	}
}
