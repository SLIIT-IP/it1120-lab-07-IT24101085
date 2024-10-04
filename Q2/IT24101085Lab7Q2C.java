public class IT24101085Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop for rows starting from 5 to 1
        for (int i = 5; i >= 1; i--) {
            // Inner loop to print each number i times in the row
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
