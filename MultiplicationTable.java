// class MultiplicationTable to find multiples of a given number
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        
		// Store multiples till 10 in an array
		int[] multiples = new int[10];
		for (int i = 1 ; i <= multiples.length ; i++) {
			multiples[i-1] = number * i;
		}
		
		// Display the multiplication table
		for (int i = 1 ; i <= multiples.length ; i++) {
			System.out.println(number + " * " + i + " = " + multiples[i-1]);
		}
		
        scanner.close();	// Close the scanner
    }
}
