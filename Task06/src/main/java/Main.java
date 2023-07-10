import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.*;

public class Main {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        char calcMethod;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter firstNumber:");
            firstNumber = in.nextDouble();

            System.out.println("Select calculator (+, -, *, /):");
            calcMethod = in.next().charAt(0);

            System.out.println("Enter secondNumber:");
            secondNumber = in.nextDouble();

            Calculator calculator = new Calculator(calcMethod, firstNumber, secondNumber);
        } catch (InputMismatchException e) {
            System.out.println("Input double values");
            e.printStackTrace();
        } catch (actionUnknownException e) {
            e.printStackTrace();
        }
    }
}
