package org.ethz.Day2;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);  // Read the first character input
        
        // Display the Unicode value of the character
        int unicode = (int) character;
        System.out.println("The Unicode value of '" + character + "' is: " + unicode);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
