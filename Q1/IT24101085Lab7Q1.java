import java.util.Scanner;

public class IT24101085Lab7Q1A {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Loop to process grades for three students
        for (int student = 1; student <= 3; student++) {
            // Prompt user to enter marks for four subjects in a single line separated by spaces
            System.out.print("Enter marks for student " + student + " (four subjects separated by space): ");
            double subject1 = input.nextDouble();
            double subject2 = input.nextDouble();
            double subject3 = input.nextDouble();
            double subject4 = input.nextDouble();

            // Calculate the average of the four subjects
            double average = (subject1 + subject2 + subject3 + subject4) / 4;

            // Display the average
            System.out.println("Average marks for student " + student + ": " + average);

            // Determine and display the grade based on the average
            if (average >= 75 && average <= 100) {
                System.out.println("Grade for student " + student + ": Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Grade for student " + student + ": Credit");
            } else if (average >= 0 && average < 50) {
                System.out.println("Grade for student " + student + ": Fail");
            } else {
                System.out.println("Invalid marks entered for student " + student + ". Please check the inputs.");
            }
            System.out.println(); // Print a blank line between students
        }

        // Close the scanner
        scanner.close();
    }
}
