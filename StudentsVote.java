//class StudentsVote to take ages of 10 students and check
import java.util.Scanner;

class StudentVote{
	public static void main(String[] args){
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter 10 students' ages
		System.out.print("Enter ages for 10 students: ");
		int[] studentAge = new int[10];
		for (int i = 0 ; i < studentAge.length ; i++) {
			studentAge[i] = scan.nextInt();
		}
		
		// Check for every age if its less than 18 years and is negative
		for (int i = 0 ; i < studentAge.length ; i++) {
			if (studentAge[i] <= 0 ) {
				System.out.println("Age " + studentAge[i] + " is invalid");
			} else if (studentAge[i] < 18) {
				System.out.println("Student with the age " + studentAge[i] + " cannot vote");
			} else {
				System.out.println("Student with the age " + studentAge[i] + " can vote");
			}
		}
		
		scan.close(); // Close the scanner
	}
}