// Class MarksGrade2D to compute percentage and grade based on marks in 3 subjects
import java.util.Scanner;

class MarksGrade2D {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create arrays to store marks, percentages, and grades
        double[][] marks = new double[numStudents][3]; // Stores marks for Physics, Chemistry, Math
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Take input for marks and ensure positive values
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Math";
                do {
                    System.out.print(subject + ": ");
                    marks[i][j] = scanner.nextDouble();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Please enter a positive value.");
                    }
                } while (marks[i][j] < 0);
            }
        }

        // Calculate percentage and assign grades
        for (int i = 0; i < numStudents; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println((i + 1) + " Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] + " Percentage: " + percentages[i] + " Grade: " + grades[i]);
        }

        scanner.close(); // Close the scanner
    }
}
