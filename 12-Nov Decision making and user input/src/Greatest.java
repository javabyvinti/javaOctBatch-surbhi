package com.bmpl.javabasic;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first value");
		int first = scanner.nextInt();

		System.out.println("Enter your second value");
		int second = scanner.nextInt();
		
		if(first>second)
		{
			System.out.println("First is greater");
			System.out.println("");
		}
		else
			System.out.println("Second is greater");
	}

}
