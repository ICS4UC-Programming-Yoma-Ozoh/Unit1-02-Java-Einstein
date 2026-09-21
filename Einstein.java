import java.util.Scanner;
/**

 * This program asks the user for the mass in kg

 * and calculates the amount of energy that can be released.

 * @author Yoma Ozoh

 * @version 1.0

 * @since 2026-09-21

 */

public final class Einstein {

    // Class-level constants placed outside of methods.
    /**
     * This constant is the speed of light in m/s.
     */
    private static final double SPEED_OF_LIGHT = 2.998 * Math.pow(10, 8);


    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class
     * @see IllegalStateException
     */

    private Einstein() {

        throw new IllegalStateException("utility class");

    }


    /**

     * This is the main method.

     *

     * @param args Unused

     */

    public static void main(final String[] args) {

        // Welcome the user
        System.out.println("Welcome, we will be calculating"
        + "the amount of energy that can be released");
        // tell user the speed of light constant
        System.out.println("The speed of light is " + SPEED_OF_LIGHT + " m/s.");
        System.out.println("Please enter the mass in"
        + "kg to calculate the energy released.");
        // Exception handling ensures the program
        // exits safely without crashing on invalid input
        Scanner scanner = new Scanner(System.in);
        try {
            double mass = Double.parseDouble(scanner.nextLine());
            if (mass < 0) {
                System.out.println("Invalid input: Mass cannot be negative.");
            } else {
                // Energy calculation: E = m * c^2
                double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
                // Formatted in scientific notation to 3 decimal places
                System.out.printf("Energy released: %.3e Joules%n", energy);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number.");
        }

        // close scanner
        scanner.close();
    }
}
