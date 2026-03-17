/**
 * Use Case 3: Display Name with Default Fallback
 * The app accepts a user's name as a command-line argument and displays a personalized greeting.
 * If no name is provided, it defaults to "World".
 */
public class UC3 {
    public static void main(String[] args) {
        // Check the length of the args array before accessing elements
        // Use a ternary operator to assign the name based on argument availability
        String name = args.length > 0 ? args[0] : "World";
        
        // Display personalized greeting
        System.out.println("Hello " + name);
    }
}
