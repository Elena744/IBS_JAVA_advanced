import Action.*;
import Exception.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        char calcMethod;
        Action action = null;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter firstNumber:");
        firstNumber = in.nextDouble();

        System.out.println("Select action (+, -, *, /):");
        calcMethod = in.next().charAt(0);

        System.out.println("Enter secondNumber:");
        secondNumber = in.nextDouble();

        switch (calcMethod) {
            case '+' -> action = new Addition();
            case '-' -> action = new Subtraction();
            case '*' -> action = new Multiplication();
            case '/' -> action = new Division();
            default -> {
                System.err.println("Action unknown");
                System.exit(0);
            }
        }
        try {
            System.out.println("Result: " + String.format("%.4f", action.act(firstNumber, secondNumber)));
        } catch (dyvisionByZeroException e) {
            e.printStackTrace();
        }
    }
}
