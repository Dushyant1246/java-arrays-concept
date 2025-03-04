// Class BMICalculator to calculate BMI and determine weight status
import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store maximum person count
        int maxPersons = 10;

        // Prompt user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Adjust array size if necessary
        if (numPersons > maxPersons) {
            maxPersons = numPersons;
        }

        // Create arrays to store height, weight, BMI, and weight status
        double[] heights = new double[maxPersons];
        double[] weights = new double[maxPersons];
        double[] bmi = new double[maxPersons];
        String[] status = new String[maxPersons];

        // Loop to take input for height and weight
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble() / 100;
        }

        // Loop to calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println((i + 1) + " height: " + heights[i] + " weight: " + weights[i] + " bmi: " + bmi[i] + " status: " + status[i]);
        }

        scanner.close(); // Close the scanner
    }
}
