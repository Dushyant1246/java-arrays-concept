// class YoungestFriends to find the Youngest and the tallest friend
import java.util.Scanner;

public class YoungestFriend {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
		
        // Declare arrays to store age and height for 3 friends
        int[] age = new int[3];
        double[] height = new double[3];


        // Loop to take user input for age and height of 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of friend " + (i + 1) + ": ");
            age[i] = scanner.nextInt();

            System.out.print("Enter the height of friend " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
        }

        // Initialize variables to find the youngest and the tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop through the arrays to find the youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Output the results
        System.out.println("\nYoungest Friend:");
        if (youngestIndex == 0) {
            System.out.println("Amar with Age= " + age[youngestIndex] + " years, Height= " + height[youngestIndex] + " cm");
        } else if (youngestIndex == 1) {
            System.out.println("Akbar with Age= " + age[youngestIndex] + " years, Height= " + height[youngestIndex] + " cm");
        } else {
            System.out.println("Anthony with Age= " + age[youngestIndex] + " years, Height= " + height[youngestIndex] + " cm");
        }

        System.out.println("\nTallest Friend:");
        if (tallestIndex == 0) {
            System.out.println("Amar with Age: " + age[tallestIndex] + " years, Height= " + height[tallestIndex] + " cm");
        } else if (tallestIndex == 1) {
            System.out.println("Akbar with Age: " + age[tallestIndex] + " years, Height= " + height[tallestIndex] + " cm");
        } else {
            System.out.println("Anthony with Age: " + age[tallestIndex] + " years, Height= " + height[tallestIndex] + " cm");
        }

        // Close the scanner
        scanner.close();
    }
}
