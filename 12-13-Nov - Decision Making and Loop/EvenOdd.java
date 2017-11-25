package com.bmpl.javabasic;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your value");
		
		int userValue = scanner.nextInt();
		
		if(userValue % 2 == 0)//remainder
		{
			System.out.println("Even No. = " + userValue);
		} else{
			System.out.println("Odd No. = "+userValue);
		}
		

	}

}
