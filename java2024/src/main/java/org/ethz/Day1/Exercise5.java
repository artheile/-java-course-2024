package org.ethz.Day1;

import java.util.Scanner;

public class Exercise5 {
public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Initialize a variable to store the product of the digits
        int product = 1;
        int temp = Math.abs(number);  // Handle negative numbers
        
        // If the number is zero, the product should be zero
        if (temp == 0) {
            product = 0;
        } else {
            // Loop to extract each digit and multiply it
            while (temp > 0) {
                int digit = temp % 10;  // Get the last digit
                product *= digit;       // Multiply the current digit
                temp /= 10;             // Remove the last digit
            }
        }
        
        // Output the result
        System.out.println("The product of the digits is: " + product);
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}