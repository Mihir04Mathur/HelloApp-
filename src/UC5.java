/**
 * Use Case 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
 * The app accepts multiple names as command-line arguments and displays a personalized greeting for all names.
 * It uses an enhanced for loop (for-each loop) to process multiple names.
 * If no arguments are provided, it displays the default greeting: "Hello, World!".
 */
public class UC5 {
    public static void main(String[] args) {
        // Use args.length == 0 to detect missing arguments.
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Use StringBuilder for efficient string construction.
            StringBuilder namesList = new StringBuilder();
            
            // Use for (String name : args) to iterate through all arguments.
            for (String name : args) {
                // Avoid trailing commas by appending delimiter conditionally.
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }
            
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}
