package org.ethz.Day1;

public class Exercise2_1 {
    public static void main(String[] args) {
        byte i = 0;
        do {
        byte a = (i++);
        byte b =--a;
        System.out.println(a + "" + b + " " + i );
        } while (i < 0);
    }
}
