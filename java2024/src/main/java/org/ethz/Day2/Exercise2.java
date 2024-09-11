package org.ethz.Day2;
import java.util.Scanner;
public class Exercise2 {

    

    
        public static void main(String[] args) {
            // Create a Scanner object to get input from the user
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter a year
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();
    
            // Prompt the user to enter the first three letters of a month name
            System.out.print("Enter the first three letters of a month name (e.g., Jan, Feb): ");
            String month = scanner.next();
    
            // Initialize variable to store the number of days in the month
            int daysInMonth = 0;
    
            // Determine the number of days in the month based on the input
            switch (month) {
                case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
                    daysInMonth = 31;
                    break;
                case "Apr": case "Jun": case "Sep": case "Nov":
                    daysInMonth = 30;
                    break;
                case "Feb":
                    // Check if the year is a leap year for February
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                default:
                    // If the input is not a valid month abbreviation
                    System.out.println("Invalid month name. Please enter a valid month (e.g., Jan, Feb).");
                    scanner.close();
                    return; // Exit the program
            }
    
            // Output the number of days in the specified month
            System.out.println("The number of days in " + month + " " + year + " is: " + daysInMonth);
    
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    
        // Method to check if a year is a leap year
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }
    