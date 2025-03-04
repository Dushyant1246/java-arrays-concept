// Class ReverseNumber to reverse the digits of a number
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store maximum digit size
        int maxDigit = 10;

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Loop to add digits to an array
        int[] digits = new int[maxDigit];
        int count = 0;
        while (number != 0) {
            if (count >= maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[count] = (int) (number % 10);
            number /= 10;
            count++;
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        scanner.close(); // Close the scanner
    }
}
