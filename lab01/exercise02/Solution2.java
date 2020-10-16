package lab01.exercise02;

import java.util.Scanner;

public class Solution2 {
	
	public static void trafficSignal(String light) {
		switch(light) {
		case "Red" : System.out.println("Stop");break;
		case "Yellow" : System.out.println("Ready");break;
		case "Green" : System.out.println("Go");break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Select One of Three lights\n1.Red\n2.Yellow\n3.Green\nEnter your choice : ");
		String light = sc.next();
		trafficSignal(light);

	}

}
