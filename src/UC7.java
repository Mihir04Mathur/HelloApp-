/**
 * Use Case 7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 * The app accepts zero or more command-line arguments and prints a greeting.
 * It uses the String.join() method to efficiently concatenate multiple names with a specified delimiter.
 * If no arguments are provided, it displays the default greeting: "Hello, World!".
 */
public class UC7 {
    public static void main(String[] args) {
        // Use args.length == 0 to detect missing arguments.
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // String.join() automatically handles the delimiter placement—no trailing delimiter is added.
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}
