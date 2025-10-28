
import java.util.Scanner;

public class TestLoopUser {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter integers (or type 'Q' to quit): ");
		
		
		// We use a while loop to keep asking for numbers till the user
		// write Q to end the program
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				int value = scan.nextInt();
				if (value >= 0) {
					if (value % 2 == 0) {
						System.out.println(value + " is positive and even!");
					} 
					else {
						System.out.println(value + " is positive and odd!");
					}
				} 
				else {
					if (value % 2 == 0) {
						System.out.println(value + " is negative and even!");
					}
					else {
						System.out.println(value + " is negative and odd!");
					}
				}
			} else {
				String input = scan.next();
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
