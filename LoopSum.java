// class LoopSum to find the sum of maximum 10 elements or if the user enters 10
import java.util.Scanner;

class LoopSum{
	public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter maximum 10 values or until 0
		System.out.print("Enter a maximum of 10 numbers or end with 0: ");
		double[] numbers = new double[10];
		int index = 0;
		while (true) {
			if (index >= 10) break;	
			numbers[index] = scan.nextDouble();
			if (numbers[index] == 0) break;	// break if input value is 0
			
			index++; // Increment index
		}
		
		// Display the numbers in the array and add to the total sum
		double totalSum = 0;
		System.out.print("Input Numbers: ");
		for (int i = 0 ; i <= index ; i++) {
			System.out.print(numbers[i] + " ");
			totalSum += numbers[i];
		}
		
		// Display the sum
		System.out.println("\nTotal sum is: " + totalSum);
		
		scan.close(); // Close the scanner
	}
}