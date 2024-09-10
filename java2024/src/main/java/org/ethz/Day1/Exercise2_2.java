package org.ethz.Day1;

public class Exercise2_2 {
    public static void main(String[] args) {
        byte i = 0;
        while (i < 0) {
            byte a = (i++);
            byte b = --a;
            System.out.println(a + " " + b + " " +i);
        }
    }
}
