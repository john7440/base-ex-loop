public class TestNumberLoop {

    public static void main(String[] args) {

        
        if (args.length == 0) {
            System.out.println("Please give at least one integer!");
            return;
        }
        
        int[] myArray = new int[args.length];

        
        for (int i = 0; i < args.length; i++) {
            myArray[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];
            if (value >= 0) {
                if (value % 2 == 0) {
                    System.out.println(value + " is positive and even!");
                } else {
                    System.out.println(value + " is positive and odd!");
                }
            } else {
                if (value % 2 == 0) {
                    System.out.println(value + " is negative and even!");
                } else {
                    System.out.println(value + " is negative and odd!");
                }
            }
        }
    }
}
