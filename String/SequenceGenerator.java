public class SequenceGenerator {

    public static void main(String[] args) {
        // Define the series length
        int seriesLength = 15;

        // Initialize the first term
        int term = 6;

        // Initialize the increment values
        int increment = 5;
        int decrement = 14;

        // Initialize the flag for alternating operations
        boolean isIncrement = true;

        // Print the first term
        System.out.print(term + ", ");

        // Loop to generate the series
        for (int i = 1; i < seriesLength; i++) {
            if (isIncrement) {
                term += increment;
            } else {
                term -= decrement;
            }

            // Print the updated term
            System.out.print(term + ", ");

            // Toggle the flag
            isIncrement = !isIncrement;

            // Adjust increment and decrement values
            if (isIncrement) {
                increment += 2;
            } else {
                decrement += 2;
            }
        }
    }
}
