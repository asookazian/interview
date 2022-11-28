package com.interview.assignment;

public class ArrayDemo {
	
	public static void main(String args[]) {
		
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        
        System.out.println("The original array is: ");
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        java.util.Arrays.sort(arr);
        
        System.out.println("\nThe sorted array is: ");
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        int i = arr[0];
        
        System.out.print("\ni: " + i);
    }
}
