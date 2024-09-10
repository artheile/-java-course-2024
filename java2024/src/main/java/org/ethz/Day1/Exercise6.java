package org.ethz.Day1;

import java.util.Random;

public class Exercise6 {
public static void main(String[] args) {
        // Create an instance of Random to generate random numbers
        Random r = new Random();
        
        // Generate a random secret number between 0 (inclusive) and 1000 (exclusive)
        int secretNumber = r.nextInt(1000);
        
        // Variables to track the number of guesses and the current guess
        int guess;
        int numberOfAttempts = 0;
        
        // Keep guessing until the correct number is guessed
        do {
            // Generate a random guess between 0 (inclusive) and 1000 (exclusive)
            guess = r.nextInt(1000);
            numberOfAttempts++;
        } while (guess != secretNumber);
        
        // Print the secret number and the number of attempts required to guess it
        System.out.println("Secret number: " + secretNumber);
        System.out.println("Number of attempts to guess the number: " + numberOfAttempts);
    }
}
