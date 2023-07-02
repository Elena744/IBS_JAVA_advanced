/**
 * @autor Elena Shikunenko
 * @version 1.0
 */
package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        String action = "";

        System.out.println("Enter firstNumber:");
        firstNumber = in.nextDouble();

        System.out.println("Enter secondNumber:");
        secondNumber = in.nextDouble();

        System.out.println("Select action (+, -, *, /):");
        action = in.next();

        in.close();

        switch (action) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.err.println("Division by 0");
                    System.exit(0);
                }
            }
            default -> {
                System.err.println("Action unknown");
                System.exit(0);
            }
        }
        System.out.println("Result: " + String.format("%.4f", result));
    }
}