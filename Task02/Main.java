package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, any number - string array)");
        int numberTask = in.nextInt();

        if (numberTask == 1) {
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
        } else {
            System.out.println("Enter count words: ");
            int countWords = in.nextInt();
            int maxLengtn = 0;
            String wordWithMaxLength = "";
            String[] text = new String[countWords];
            for (String word : text) {
                System.out.println("Enter word: ");
                word = in.next();
                if (word.length() > maxLengtn){
                    maxLengtn = word.length();
                    wordWithMaxLength = word;
                }
            }
            System.out.println("Answer: " + wordWithMaxLength);
        }
        in.close();
    }
}