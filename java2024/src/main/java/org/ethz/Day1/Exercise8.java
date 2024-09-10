package org.ethz.Day1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the value of N
        System.out.print("Enter the value of N to get the N-th Fibonacci number: ");
        int n = scanner.nextInt();
        
        // Validate the input
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than or equal to 1.");
            scanner.close();
            return;
        }
        
        // Initialize the first two Fibonacci numbers
        int a = 0;
        int b = 1;
        int fibonacci = 0;
        
        // Calculate the N-th Fibonacci number
        if (n == 1) {
            fibonacci = a;
        } else if (n == 2) {
            fibonacci = b;
        } else {
            for (int i = 3; i <= n; i++) {
                fibonacci = a + b;
                a = b;
                b = fibonacci;
            }
        }
        
        // Output the N-th Fibonacci number
        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
