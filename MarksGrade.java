// Class MarksGrade to compute percentage and grade
import java.util.Scanner;

class MarksGrade {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create separate arrays to store marks, percentages, and grades
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] math = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks and ensure positive values
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Get Physics marks
            do {
                System.out.print("Physics: ");
                physics[i] = scanner.nextDouble();
                if (physics[i] < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (physics[i] < 0);

            // Get Chemistry marks
            do {
                System.out.print("Chemistry: ");
                chemistry[i] = scanner.nextDouble();
                if (chemistry[i] < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (chemistry[i] < 0);

            // Get Math marks
            do {
                System.out.print("Math: ");
                math[i] = scanner.nextDouble();
                if (math[i] < 0) {
                    System.out.println("Marks cannot be negative. Please enter a positive value.");
                }
            } while (math[i] < 0);
        }

        // Calculate percentage and assign grades
        for (int i = 0; i < numStudents; i++) {
            double total = physics[i] + chemistry[i] + math[i];
            percentages[i] = total / 3; // Calculate percentage

            // Assign grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display marks, percentages, and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + " Physics: " + physics[i] + " Chemistry: " + chemistry[i] + " Maths: " + math[i] + " Percentage: " + percentages[i] + " Grade: " + grades[i]);
        }

        scanner.close(); // Close the scanner
    }
}
