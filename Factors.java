// class Factors to find and store factors of a numebr in an array and display
import java.util.Scanner;

class Factors{
	public static void main(String[] args) {
		// Create a scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user to take input number
		System.out.println("Enter a number: ");
		int number = scan.nextInt();
		
		// Store the factors of the number into an array
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;
		for (int i = 1 ; i <= number ; i++) {
			// Double the array size if it exceeds current index
			if (index >= maxFactor) {
				maxFactor *= 2;
				int[] temp = new int[maxFactor];
				// Copy the elements to a temperory array
				for (int j = 1 ; j <= factors.length ; j++) {
					temp[j-1] = factors[j-1]; 
				}
				// Reassign the temperory array to factors which has double the size
				factors = temp;
			}
			if (number % i == 0) {
				factors[index] = i;
				index++;
			}
		}
		
		// Print the factors
		for (int i = 0 ; i < factors.length ; i++) {
			if (factors[i] == 0) break;
			System.out.print(factors[i] + " ");
		}
		
	}
}