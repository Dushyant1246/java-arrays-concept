// class LargestDigit to find largest and sencond largest digit from a number
import java.util.Scanner;

class LargestDigit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
		// Variable to store maximum digit size
		int maxDigit = 10;
		
        // Prompt user to enter a number
        System.out.print("Enter a number ( " + maxDigit + " maximum digits): ");
        int number = scanner.nextInt();
        
        // Loop to add digits to an array
		int[] digits = new int[maxDigit];
		int count = 0;
        while (number != 0) {
			if (count >= maxDigit) {
				System.err.println("Maximum limit exceeded");
				System.exit(-1);
			}
			digits[count] = number % 10;
            number /= 10;
            count++;
        }
        
		// Find the largest and second largest digits
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0 ; i < digits.length ; i++) {
			if (digits[i] > largest) {
				largest = digits[i];
			}
			if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		
        // Display the count
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
        
        scanner.close();  // Close the scanner
    }
}