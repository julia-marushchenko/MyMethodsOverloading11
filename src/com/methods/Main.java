// Java program to demonstrate methods overloading

package com.methods;

// Main class
public class Main {

    // Method substruction() to find difference of two integers
    public int substruction(int number, int number1){
        int result = number - number1;
        return result;
    }

    // Method substruction() to  find difference of three integers
    public int substruction(int number, int number1, int number2){
        int result = number - number1 - number2;
        return result;
    }

    // Method substruction() to find difference of two doubles
    public double substruction(double number, double number1){
        double result = number - number1;
        return result;
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Main instance
        Main m = new Main();

        // Substruction of two integers
        int sub = m.substruction(14, 17);
        // Printing to console the result
        System.out.println(sub);

        // Substruction of three integers
        int sub1 = m.substruction(14, 8, 2);
        // Printing to console the result
        System.out.println(sub1);

        // Substruction of two doubles
        double sub2 = m.substruction(14.7, 11.4);
        // Printing to console the result
        System.out.println(sub2);
    }
}
