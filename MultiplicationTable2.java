// class MultiplicationTable2 to find multiples of a given number from 6 to 9
import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        
		// Store multiples from 6 to 9 (4 values) in an array
		int[] multiplicationResult = new int[4];
		for (int i = 0 ; i < multiplicationResult.length ; i++) {
			multiplicationResult[i] = number * (i + 6);
		}
		
		// Display the multiplication table
		for (int i = 0 ; i < multiplicationResult.length ; i++) {
			System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
		}
		
        scanner.close();	// Close the scanner
    }
}
