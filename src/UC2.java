/**
 * Use Case 2: Personalized Greeting via Command-Line
 * This version accepts a single command-line argument (a name) and
 * prints a personalized greeting. It falls back to "Hello World" if
 * no arguments are provided.
 */
public class UC2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } else {
            System.out.println("Hello World");
        }
    }
}
