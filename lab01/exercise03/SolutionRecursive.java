/*
 The Fibonacci sequence is defined by the following rule. 
 The first 2 values in the sequence are 1, 1. 
 Every subsequent value is the sum of the 2 values preceding it. 
 Write a Java program that uses both recursive and non-recursive functions 
 to print the nth value of the Fibonacci sequence? 
 */

package lab01.exercise03;

import java.util.Scanner;

public class SolutionRecursive {
	
	public static int recursiveFibonacci(int num) {
		if(num == 1 || num == 2) {
			 return 1;
		}
		else {
			return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int fibonacci = recursiveFibonacci(num);
		System.out.println("The "+ num + " of fibonacci series = "+fibonacci);
	}

}
