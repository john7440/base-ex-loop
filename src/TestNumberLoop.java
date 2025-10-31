public class TestNumberLoop {

    public static void main(String[] args) {

    	 // Check if any command-line arguments were provided
        if (args.length == 0) {
            System.out.println("Please give at least one integer!");
            
            // Exit the program if no input is given
            return;
        }
        
        // Create an array to store the parsed integers
        int[] myArray = new int[args.length];

        // Convert each command-line argument from String to integer
        for (int i = 0; i < args.length; i++) {
            myArray[i] = Integer.parseInt(args[i]);
        }
        
        // Loop through the array and analyze each number
        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];
            
            // Check if the number is positive or negative
            if (value >= 0) {
            	
            	// Check if it's even or odd
                if (value % 2 == 0) {
                    System.out.println(value + " is positive and even!");
                } else {
                    System.out.println(value + " is positive and odd!");
                }
            } else {
            	
            	// For negative numbers, check if it's even or odd
                if (value % 2 == 0) {
                    System.out.println(value + " is negative and even!");
                } else {
                    System.out.println(value + " is negative and odd!");
                }
            }
        }
    }
}
