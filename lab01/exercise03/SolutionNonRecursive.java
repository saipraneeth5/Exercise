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
		System.out.println(fibonacci);

	}

}
