/**
 * Use Case 4: Display Multiple Names
 * The app accepts multiple names as command-line arguments and displays a personalized greeting for all names.
 * If no names are provided, it defaults to "World".
 */
public class UC4 {
    public static void main(String[] args) {
        // Check args.length to determine if arguments were provided
        if (args.length > 0) {
            // The String.join() method efficiently combines multiple strings with a delimiter
            String names = String.join(", ", args);
            // App displays a single greeting with all names
            System.out.println("Hello, " + names + "!");
        } else {
            // If no arguments exist, app uses the default value "World"
            System.out.println("Hello, World!");
        }
    }
}
