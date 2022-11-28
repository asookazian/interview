package com.interview.assignment;

public class Triangle {
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * *
		 * * *
		 * * * *
		 * * * * *
		 5 4 3 2 1  = 15*/

		long rtn = triangle(500000);

		System.out.println("rtn = " + rtn);
	}
	
	private static long triangle(long maxHeight) {
		
		long rtn = 0;
		
		if(maxHeight == 1) {
			return 1;
		}
		else {
			
			rtn = maxHeight + triangle(maxHeight - 1);
		}
		
		return rtn;
	}

}
