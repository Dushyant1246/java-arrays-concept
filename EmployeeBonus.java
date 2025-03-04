// EmployeeBonus class to find the bonus of employees based on their years of service
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
		
        // Declare the number of employees
        int numEmployees = 10;

        // Create arrays to store employee data
        double[] oldSalary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;


        // Take input for salary and years of service for each employee
        for (int i = 0; i < numEmployees; i++) {
            // Read and validate old salary
            while (true) {
                System.out.print("Enter the old salary of employee " + (i + 1) + ": ");
                oldSalary[i] = scanner.nextDouble();
                if (oldSalary[i] > 0) {
                    break; // Valid salary
                } else {
                    System.out.println("Invalid salary. Please enter a positive number.");
                }
            }

            // Read and validate years of service
            while (true) {
                System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break; // Valid years of service
                } else {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                }
            }
        }

        // Loop to calculate bonus, new salary, and the totals
        for (int i = 0; i < numEmployees; i++) {
            // Calculate the bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05; // 5% bonus for more than 5 years of service
            } else {
                bonus[i] = oldSalary[i] * 0.02; // 2% bonus for 5 or less years of service
            }

            // Calculate the new salary
            newSalary[i] = oldSalary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Print the details of each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println("Old Salary: " + oldSalary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
