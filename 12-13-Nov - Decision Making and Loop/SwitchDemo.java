package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo {

	//switch statements
	
	public static void main(String[] args) {
		
		// check vowel or consonant using if-else and switch
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		String userChoice = scanner.next();// accept one word without any space from user
		
		switch(userChoice){//switch("t")
		case "a": // userChoice == "a"
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		System.out.println("exited from switch");
		
//		if(userChoice.equals("a") || userChoice.equals("e") || 
//				userChoice.equals("i") || userChoice.equals("o") ||
//				userChoice.equals("u"))
//		{
//			System.out.println("Vowel");
//		} 
//		else{
//			System.out.println("Consonant");
//		}
		
	}

}
