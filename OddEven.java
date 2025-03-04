// class OddEven to find odd and even numbers 
import java.util.Scanner;

class OddEven{
	public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter the number
        System.out.print("Enter a natural number: ");
        int number = scan.nextInt();
		
		// Check if the number is natural
		if (number > 0) {
			// Varibles to store odd and even numbers
			int[] odd = new int[(number / 2) + 1];
			int[] even = new int[(number / 2) + 1];
			
			// Store odd and even values respectively
			for ( int i = 1 ; i <= number ; i++) {
				if (i % 2 == 0) {
					even[(i - 1) / 2] = i;
				} else {
					odd[(i - 1) / 2] = i;
				}
			}
			
			// Display odd and even numbers
			System.out.print("Odd numbers: ");
			for (int i = 0 ; i < odd.length && odd[i] != 0; i++) {
				System.out.print(odd[i] + " ");
			}
			System.out.print("\nEven numbers: ");
			for (int i = 0 ; i < even.length && even[i] != 0 ; i++) {
				System.out.print(even[i] + " ");
			}
			
		} else {
			System.err.println("Not a natural number");
			System.exit(1);
		}
		
		scan.close(); // Close the scanner
	}
}