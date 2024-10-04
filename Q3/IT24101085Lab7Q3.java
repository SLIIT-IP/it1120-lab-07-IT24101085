import java.util.Scanner;

public class IT24101085Lab7Q3 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Loop through 5 customers
        for (int i = 1; i <= 5; i++) {
            // Variables to hold bill amount, discount, and final amount to pay
            double billAmount, discount = 0, amountToPay;
            char paymentMode;

            // Get the total bill amount from the user
            System.out.print("Enter the total bill amount for customer " + i + ": ");
            billAmount = input.nextDouble();

            // Ask the user to enter the mode of payment
            System.out.print("Enter mode of payment (C for Cash / O for Other): ");
            paymentMode = sc.nextChar();

            // Validate the payment mode and calculate discount if applicable
            if (paymentMode == 'C' || paymentMode == 'c') {
                // Apply 5% discount for cash payment
                discount = billAmount * 0.05;
                amountToPay = billAmount - discount;
                System.out.println("Customer " + i + " gets a 5% discount.");
                System.out.printf("Total bill amount: %.2f, Discount: %.2f, Amount to pay: %.2f\n", billAmount, discount, amountToPay);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other payment modes
                amountToPay = billAmount;
                System.out.println("Customer " + i + " does not get a discount.");
                System.out.printf("Total bill amount: %.2f, Amount to pay: %.2f\n", billAmount, amountToPay);
            } else {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid.");
            }

            System.out.println(); // Print a blank line for spacing between customers
        }

        // Close the scanner
        scanner.close();
    }
}
