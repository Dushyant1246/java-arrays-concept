// Class BMICalculator2D to calculate BMI using a multi-dimensional array
import java.util.Scanner;

class BMICalculator2D {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for a number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        // Take input for weight and height, ensuring positive values
        for (int i = 0; i < numPersons; i++) {
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble() / 100;
                if (personData[i][1] <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numPersons; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // BMI Calculation

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.println((i + 1) + " height: " + personData[i][0] + " weight: " + personData[i][1] + " bmi: " + personData[i][2] + " status: " + weightStatus[i]);
        }

        scanner.close(); // Close the scanner
    }
}
