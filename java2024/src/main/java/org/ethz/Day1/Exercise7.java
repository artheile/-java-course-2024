package org.ethz.Day1;

import java.util.Scanner;

public class Exercise7 {
public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the weight of the package
        System.out.print("Enter the weight of the package (in kg): ");
        double weight = scanner.nextDouble();
        
        // Variable to store the cost
        double cost;
        
        // Determine the cost based on the weight
        if (weight > 0 && weight <= 3) {
            cost = 15.0;
        } else if (weight > 3 && weight <= 5) {
            cost = 25.0;
        } else if (weight > 5 && weight <= 10) {
            cost = 42.0;
        } else {
            // Out of bounds message
            System.out.println("Weight out of bounds. Please enter a weight between 0 and 10 kg.");
            scanner.close();
            return; // Exit the program
        }
        
        // Output the cost
        System.out.println("The cost of shipping is: $" + cost);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
