//class NumbersCheck to take ages of 10 students and check
import java.util.Scanner;

class NumbersCheck{
	public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter 5 numbers
		System.out.print("Enter 5 numbers: ");
		int[] number = new int[5];
		for (int i = 0 ; i < number.length ; i++) {
			number[i] = scan.nextInt();
		}
		
		// Check for number for positive, negative, zero and odd, even if positive
		for (int i = 0 ; i < number.length ; i++) {
			System.out.print(number[i] + ": ");
			if (number[i] < 0 ) {
				System.out.println("negative ");
			} else if (number[i] > 0) {
				System.out.print("positive ");
				if (number[i] % 2 == 0) {
					System.out.println("even");
				} else {
					System.out.println("odd");
				}
			} else {
				System.out.println("zero ");
			}
		}
		
		// Comparing first and last element
		if (number[0] > number[number.length - 1]) {
			System.out.println("First number is greater than the last number");
		} else if (number[0] < number[number.length - 1]) {
			System.out.println("First number is less than the last number");
		} else {
			System.out.println("First number and last number are equal");
		}
		
		scan.close(); // Close the scanner
	}
}