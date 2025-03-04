// class 2DArray to convert 2d array to single dimension array
import java.util.Scanner;

class Array2D{
	public static void main(String[] args) {
		// Create scanner object to take input
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to take rows-size, columns-size and the elemnts
		System.out.print("Enter rows size: ");
		int row = scan.nextInt();
		System.out.print("Enter columns size: ");
		int column = scan.nextInt();
		System.out.println("Enter the matrix elements:");
		int[][] matrix = new int[column][row];
		for (int i = 0 ; i < column ; i++) {
			for (int j = 0 ; j < row ; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		// Store the elements of matrix into a single dimension array
		int[] array = new int[row * column];
		int index = 0;
		for (int i = 0 ; i < column ; i++) {
			for (int j = 0 ; j < row ; j++) {
				array[index] = matrix[i][j];
				index++;
			}
		}
		
		// Print the single dimension array
		System.out.println("Elements of single dimension converted array:");
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
}