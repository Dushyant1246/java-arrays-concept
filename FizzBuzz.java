// class FizzBuzz to print fizz buzz according to if it is a multiple of 3 or 5 and store it into an array
import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter the number
        System.out.print("Enter a natural number: ");
        int number = scan.nextInt();
		
		// Check if entered number is natural or not
		if (number > 0) {
			// Store data into a String array
			String[] array = new String[number];
			for (int i = 0 ; i < number ; i++) {
				// Check if number is divisible by both 3 and 5 , one of them or none and store data accordingly
				if ((i+1) % 3 == 0 && (i+1) % 5 == 0) {
					array[i] = "FizzBuzz";
				} else if ((i+1) % 5 == 0) {
					array[i] = "Buzz";
				} else if ((i+1) % 3 == 0) {
					array[i] = "Fizz";
				} else {
					array[i] = (i+1) + "";
				}
			}
			
			// Print the result
			for (int i = 0 ; i < number ; i++) {
				System.out.print(array[i] + " ");
			}
			
		} else {
			System.err.print("Please enter a natural number");
			System.exit(-1);
		}
		
		scan.close(); // Close the scanner
	}
}