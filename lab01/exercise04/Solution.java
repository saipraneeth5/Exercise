/*
 Write a Java program that prompts the user for an integer and 
 then prints out all the prime numbers up to that Integer? 
 */

package lab01.exercise04;
import java.util.Scanner;

public class Solution {
	
	public static void primeNumber(int num) {
		for(int i = 2;i <= num; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num  = sc.nextInt();
		primeNumber(num);

	}

}
