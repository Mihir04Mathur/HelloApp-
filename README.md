# Hello App

A simple Java application that starts with displaying "Hello World" and progresses to displaying command-line arguments, standard input, and names in a banner format.

## Project Structure

This project is organized into multiple Use Cases (UC), demonstrating progressive enhancements:

*   **UC1 (Simple Display):**
    *   The initial version simply prints the text "Hello World" to the console using a single `System.out.println` statement.
    *   *Goal:* Establish the basic functionality.

*   **UC2 (Personalized Greeting):**
    *   Enhances the app by accepting a single user name via command-line arguments.
    *   If no argument is provided, the application gracefully defaults to "Hello World".
    *   *Goal:* Introduce parsing of simple command-line arguments in Java.

## How to Run (Using IntelliJ IDEA)

This project has been structured for IntelliJ IDEA (using a `src` directory with packages). 

1. **Open the Project:**
   Open IntelliJ IDEA, select **Open**, and choose the `Hello_App` folder.
2. **Explore the Code:**
   Navigate to the `src` folder in your "Project" view (Alt+1 / Cmd+1).
   - Use Case 1 is located at `src/uc1/HelloApp.java`
   - Use Case 2 is located at `src/uc2/HelloApp.java`
3. **Run Use Case 1 (Simple Display):**
   - Open `src/uc1/HelloApp.java`.
   - Click the green "Play" button next to the `public static void main` method.
   - It will print "Hello World".
4. **Run Use Case 2 (Personalized Greeting):**
   - Open `src/uc2/HelloApp.java`.
   - Click the green "Play" button next to the `main` method.
   - **To pass a name (Command-Line argument):** 
     - Go to the Run menu -> **Edit Configurations...**
     - In the **Program arguments** box under the `HelloApp` configuration, type a name (e.g., `"John Doe"`).
     - Click **Apply** and **Run**.

## How to Run (Command Line)
If you still prefer the command line:

```bash
cd c:\Users\Owner\Documents\AntiGravity\Hello_App\src
javac uc1/HelloApp.java
java uc1.HelloApp

javac uc2/HelloApp.java
java uc2.HelloApp "John Doe"
```
