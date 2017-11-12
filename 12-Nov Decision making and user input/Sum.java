//user input
// command line arguments
// Scanner 

class Sum {


	public static void main(String args[])
	{
		//run -> no of arguments
		
		//Wrapper classes --> Integer, Float, Long, Double, etc
		//wrapper function --> parseInt(), parseFloat(), parseDouble()
		
		System.out.println("Enter your first value");
		int value1 = Integer.parseInt(args[2]);
		int value2 = Integer.parseInt(args[1]);

		int result = value1 + value2;

		System.out.println("Result is = " +result);
	}
}

	