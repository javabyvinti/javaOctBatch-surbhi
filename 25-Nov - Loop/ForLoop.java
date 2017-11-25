package com.bmpl.javabasic;

//declaration and initialization , condition, increment/decrement

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Exited from Loop");

		int j = 1;
		//entry controlled loop
		while(j <=10){//j = 11<=10
			System.out.println(j);
			j++;
		}
		
		do{
			System.out.println(j);
			j++;//j=12
		}while(j<=10);// 12<=10 --> exit controlled loop
	
	}

}
//while --> enter controlled loop --> 