
import java.util.Scanner;

public class TestLoopUser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		 // Prompt the user to enter integers or 'Q' to quit
		System.out.println("Enter integers (or type 'Q' to quit): ");
		
		/**
         * Use a while loop to continuously read input from the user.
         * The loop continues until the user types 'Q' (case-insensitive).
         */
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				int value = scan.nextInt();
				
				// Check if the integer is positive or negative
				if (value >= 0) {
					// Check if it's even or odd
					if (value % 2 == 0) {
						System.out.println(value + " is positive and even!");
					} 
					else {
						System.out.println(value + " is positive and odd!");
					}
				} 
				else {
					
					// For negative numbers, check if it's even or odd
					if (value % 2 == 0) {
						System.out.println(value + " is negative and even!");
					}
					else {
						System.out.println(value + " is negative and odd!");
					}
				}
			} else {
				
				// Read non_integer input
				String input = scan.next();
				
				// Check if the user wants to quit
				if (input.equalsIgnoreCase("q")) {
					System.out.println("You are quitting the program! See you next time!");
					break;
				}
				else {
					System.out.println( input + " is not valid! Please try again!");
				}
			}
		}
		
		scan.close();
	}

}
