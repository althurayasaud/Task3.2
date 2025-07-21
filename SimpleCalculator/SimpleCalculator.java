// Import Scanner class to get input from the user
import java.util.Scanner;

// Main class
public class SimpleCalculator {

    // The main method where the program starts
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // control the loop
        boolean running = true;

        // Repeat the menu until the user chooses to exit
        while (running) {

            showMenu();

            // choose an operation
            System.out.print("Choose the number: ");
            int choice = input.nextInt(); // Read user input

            // Use switch
            switch (choice) {
                case 1:
                    add(input); // add method
                    break;
                case 2:
                    subtract(input); // subtract method
                    break;
                case 3:
                    multiply(input); // multiply method
                    break;
                case 4:
                    divide(input); // divide method
                    break;
                case 5:
                    squareRoot(input); // square root method
                    break;
                case 6:
                    power(input); // power (exponent) method
                    break;
                case 0:
                    // If the user enters 0, exit the loop
                    System.out.println(" Calculator is closing...");
                    running = false;
                    break;
                default:

                    System.out.println(" Invalid choice.try again.");
            }
        }

        // Close the Scanner object
        input.close();
    }

    // Method to display the menu
    public static void showMenu() {
        System.out.println("\n Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("0. Exit");
    }

    // Method to perform addition
    public static void add(Scanner input) {
        System.out.print("Enter first num: ");
        double a = input.nextDouble(); // first number
        System.out.print("Enter second num: ");
        double b = input.nextDouble(); // second number
        System.out.println("Result: " + (a + b)); // Print result
    }

    // Method to perform subtraction
    public static void subtract(Scanner input) {
        System.out.print("Enter the first num: ");
        double a = input.nextDouble();
        System.out.print("Enter the second numb: ");
        double b = input.nextDouble();
        System.out.println("Result: " + (a - b));
    }

    // Method to perform multiplication
    public static void multiply(Scanner input) {
        System.out.print("Enter the first num: ");
        double a = input.nextDouble();
        System.out.print("Enter the second num: ");
        double b = input.nextDouble();
        System.out.println("Result: " + (a * b));
    }

    // Method to perform division
    public static void divide(Scanner input) {
        System.out.print("Enter the first num: ");
        double a = input.nextDouble();
        System.out.print("Enter the second num: ");
        double b = input.nextDouble();

        // Prevent division by zero
        if (b == 0) {
            System.out.println(" Error:Cannot divide by zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    // calculate square root
    public static void squareRoot(Scanner input) {
        System.out.print("Enter a num: ");
        double num = input.nextDouble();

        // Prevent square root of negative numbers
        if (num < 0) {
            System.out.println("Error: Cannot take the square root of a negative number.");
        } else {
            System.out.println("Square Root: " + Math.sqrt(num));
        }
    }

    //  calculate power
    public static void power(Scanner input) {
        System.out.print("Enter the base num: ");
        double base = input.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();

        System.out.println("Result: " + Math.pow(base, exponent));
    }
}