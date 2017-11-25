package com.bmpl.javabasic;
// Enter your choice
// Press 1 for Addition
// Press 2 for Subtraction
// Press 3 for Multiplication
// Press 4 for Division
// Press 5 for Exit

import java.util.Scanner;

// enter your first value
//enter your second value
// first - second

public class MenuProgram1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userChoice;
		char userInput;
		
		do{
		
		System.out.println("Enter your choice");
		
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Divion");
		//System.out.println("Press 5 for Exit");

		userChoice = scanner.nextInt();	
		
//		if(userChoice == 5){
//			break;
//		}
		
		System.out.println("Enter your first value");
		int first = scanner.nextInt();
		System.out.println("Enter your second value");
		int second = scanner.nextInt();			
		int result = 0;
		
		switch(userChoice)
		{
		case 1: 
			result = first + second;
			System.out.println("Sum is = "+result);
			break;
			
		case 2: 
			result = first - second;
			System.out.println("Subtraction is = "+ result);
			break;

		case 3: 
			result = first * second;
			System.out.println("Sum is = "+result);
			break;

		case 4: 
			result = first / second;
			System.out.println("Sum is = "+result);
			break;
		}
		System.out.println("Do you want to continue");
		System.out.println("Press Y or y to continue");
		System.out.println("Press N or n to exit");
		
		userInput = scanner.next().charAt(0);
		
		}while(userInput!='n' || userInput!='N');
		
		System.out.println("Exited");
	}

}
