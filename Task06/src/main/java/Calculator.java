import Action.*;
import Exception.*;

public class Calculator {
    private Action action = null;

    public Calculator(char calcMethod, double firstNumber, double secondNumber) throws actionUnknownException{
       try {
            switch (calcMethod) {
                case '+' -> action = new Addition();
                case '-' -> action = new Subtraction();
                case '*' -> action = new Multiplication();
                case '/' -> action = new Division();
                default -> {
                    throw new actionUnknownException("Action unknown");
                }
            }
            Action.toString(action.value(firstNumber, secondNumber));
        } catch (divisionByZeroException e) {
            e.printStackTrace();
        }
    }
}