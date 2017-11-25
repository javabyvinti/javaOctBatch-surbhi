package com.bmpl.javabasic;

public class WhileLoop {

	//Repeat some statements until a condition met
	// Loops --> while loop and do-while and for loop
	// initialization, condition, increment or decrement
	
	public static void main(String[] args) {
	
		int value = 1;	//initialization
		
		//While --> Entry Controlled Loop
		while(value<=10){//condition 11<=10
			System.out.println("value = " + value);	// 1 3 5 7 9
			//value = value + 2;
			value++;	//increment 1 = 9 + 2 =value = 11
		}

	}

}
