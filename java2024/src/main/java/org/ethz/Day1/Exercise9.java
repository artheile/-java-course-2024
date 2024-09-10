package org.ethz.Day1;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        final int LIMIT = 100000;
        List<Integer> perfectNumbers = new ArrayList<>();
        
        // Find all perfect numbers less than LIMIT
        for (int number = 2; number < LIMIT; number++) {
            if (isPerfectNumber(number)) {
                perfectNumbers.add(number);
            }
        }
        
        // Print the perfect numbers
        System.out.println("Perfect numbers less than " + LIMIT + ": " + perfectNumbers);
    }

    // Method to check if a number is a perfect number
    private static boolean isPerfectNumber(int number) {
        int sum = 1; // 1 is a divisor of all numbers
        int sqrt = (int) Math.sqrt(number);
        
        // Find divisors and their sum
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        
        return sum == number;
    }
}
