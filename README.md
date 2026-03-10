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

## How to Run

Ensure you have the Java Development Kit (JDK) installed on your system.

1.  **Navigate to the project directory:**
    ```bash
    cd c:\Users\Owner\Documents\AntiGravity\Hello_App
    ```

2.  **Compile and Run:**

    *   **Compile:**
        ```bash
        javac HelloApp.java
        ```
    *   **Run (Default):**
        ```bash
        java HelloApp
        ```
    *   **Run (With Name):**
        ```bash
        java HelloApp "John Doe"
        ```
