package org.ethz.Day1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        
        // Declare constants
        final double PI = 3.14159;  // Approximation of Pi
        
        // Create a Scanner object to get input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        // Compute the area and circumference
        double area = PI * radius * radius;          // Area formula: π * r^2
        double circumference = 2 * PI * radius;      // Circumference formula: 2 * π * r
        
        // Output the results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
        
        // Close the scanner to avoid resource leaks
        input.close();
    }
}
