/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static String capitalize(String text) {
        return text.toUpperCase();
    }

    public static String greetAndCapitalize(String name) {
        String greeting = greet(name); // Get the greeting
        String capitalized = capitalize(greeting); // Capitalize the greeting
        return "Greeting: " + greeting + "\nCapitalized Greeting: " + capitalized + "\nFinal Result: " + capitalized;
    }

    public static void main(String[] args) throws java.lang.Exception {
        String name = "Alice";
        String finalResult = greetAndCapitalize(name);
    
        // Display the results
        System.out.println(finalResult);
    }
}

// Greeting: Hello, Alice!
// Capitalized Greeting: HELLO, ALICE!
// Final Result: HELLO, ALICE!




