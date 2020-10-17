/*Create a class with a method which can calculate 
 * the sum of first n natural numbers which are divisible by 3 or 5.*/

package lab01.exercise05;

import java.util.Scanner;

public class Solution {
	
	public static int calculateSum(int n) {
		int sum = 0;
		for(int iter = 1; iter <= n; iter++) {
			if(iter % 3 ==0 || iter % 5 ==0) {
				System.out.println(iter);
				sum += iter;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int sum = calculateSum(num);
		System.out.println("sum of first "+ num +" natural numbers which are divisible by 3 or 5 : " + sum);
	}

}
