// class MeanHeight to find the mean height of 11 football players
import java.util.Scanner;

class MeanHeight{
	public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter 11 values for players' height
		System.out.print("Enter heights of 11 players: ");
		double[] playerHeight = new double[11];
		for (int i = 0 ; i < playerHeight.length ; i++) {
			playerHeight[i] = scan.nextInt();
		}
		
		// Calculate the total sum of heights
		double sum = 0;
		for (int i = 0 ; i < playerHeight.length ; i++) {
			sum += playerHeight[i];
		}
		
		// Display the mean height according to the data
		System.out.println("Mean Height: " + (sum / 11));
		
		scan.close(); // Close the scanner
	}
}