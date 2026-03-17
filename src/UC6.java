/**
 * Use Case 6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter
 * The app accepts zero or more command-line arguments and prints a greeting.
 * It uses an enhanced for loop to process multiple names and the substring method to remove the trailing delimiter.
 * If no arguments are provided, it displays the default greeting: "Hello, World!".
 */
public class UC6 {
    public static void main(String[] args) {
        // Use args.length == 0 to detect missing arguments.
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Use for (String name : args) to iterate through all arguments.
            for (String name : args) {
                // Always append the same delimiter after each name, including the last one.
                nameBuilder.append(name).append(", ");
            }
            
            // Check nameBuilder.length() > 0 before calling substring() to avoid errors.
            String names = "";
            if (nameBuilder.length() > 0) {
                // Use substring(0, nameBuilder.length() - 2) to remove the last two characters (", ").
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
            
            System.out.println("Hello, " + names + "!");
        }
    }
}
