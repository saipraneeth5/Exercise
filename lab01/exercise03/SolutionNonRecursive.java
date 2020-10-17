/*
 The Fibonacci sequence is defined by the following rule. 
 The first 2 values in the sequence are 1, 1. 
 Every subsequent value is the sum of the 2 values preceding it. 
 Write a Java program that uses both recursive and non-recursive functions 
 to print the nth value of the Fibonacci sequence? 
 */

package lab01.exercise03;

import java.util.Scanner;

public class SolutionNonRecursive {
	
	public static int nonrecursiveFibonacci(int num) {
		int num1 = 1,num2 = 1, numAt = 0;
		 for(int iter = 2;iter < num; iter++)    
		 {    
		  numAt = num1 + num2;       
		  num1 = num2;    
		  num2 = numAt;    
		 }   
		return numAt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int fibonacci = nonrecursiveFibonacci(num);
		System.out.println("The "+ num + " of fibonacci series = "+fibonacci);

	}

}
