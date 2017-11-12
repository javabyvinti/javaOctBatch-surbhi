import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter your first value");
		int value1 = scanner.nextInt();
		
		System.out.println("Enter your second value");
		int value2 = scanner.nextInt();
		
		int result = value1 + value2;
		System.out.println("Result is = " +result);
	}

}
