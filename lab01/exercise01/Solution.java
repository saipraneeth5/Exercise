package lab01.exercise01;

import java.util.Scanner;

public class Solution {
	
	public static int sumOfCube(int num) {
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			sum += rem * rem * rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int result = sumOfCube(num);
		System.out.println(result);
	}

}
