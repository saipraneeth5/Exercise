/*
 Write a java program that simulates a traffic light. 
 The program lets the user select one of three lights: red, yellow, or green 
 with radio buttons. On entering the choice, an appropriate message 
 with “stop” or “ready” or “go” should appear in the console .
 Initially there is no message shown. 
 */
package lab01.exercise02;

import java.util.Scanner;

public class Solution {
	
	public static void trafficSignal(String light) {
		if(light.equalsIgnoreCase("Red")) {
			System.out.println("Stop");
		}
		else if(light.equalsIgnoreCase("Yellow")) {
			System.out.println("Ready");
		}
		else {
			System.out.println("Go");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select One of Three lights\n1.Red\n2.Yellow\n3.Green\nEnter your choice : ");
		String light = sc.next();
		trafficSignal(light);
	}

}
