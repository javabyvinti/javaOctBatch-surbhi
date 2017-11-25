package com.bmpl.javabasic;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		//User input --> 32 --> 3 + 4 + 5 = 12

		int sum = 0, temp;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your value");
		
		int userChoice = scanner.nextInt();
		
	
		while(userChoice>0){ // 3 > 0
			//34 % 10 --> 4
			temp = userChoice % 10; //provide remainder
			sum = sum + temp; // 0 + 5 = sum =  5 + 4 = 9 + 3 = 12
			userChoice = userChoice / 10; // quotient userChoice = 3 
		}
		
		System.out.println("Sum of Digit is = " +sum);
	}
	// Press 1 for addition
	// Press 2 for subtraction
	// Press 3 for multiply
	// Press 4 to exit --> do-while
	

}
