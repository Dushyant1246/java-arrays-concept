// class Frequency to find the frequency of each digit
import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        // Take input for a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Find the digits in the number and save them in an array
		int length = 0;
		long temp = number;
		while (temp != 0) {
            temp /= 10; // Remove last digit
            length++;
        }
		
        int[] digits = new int[length];
        int count = 0;
        temp = number;

        while (temp != 0) {
            digits[count] = (int) (temp % 10); // Extract last digit
            temp /= 10; // Remove last digit
            count++;
        }

        // Define a frequency array of size 10
        int[] frequency = new int[10];

        // Loop through the digits array and increase the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " : " + frequency[i]);
            }
        }

        scanner.close(); // Close scanner
    }
}
