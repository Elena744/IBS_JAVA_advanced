package Action;
import Exception.*;

public class Division implements Action{
    @Override
    public double value(double first, double second) throws divisionByZeroException{
        if (second != 0) {
            return first / second;
        } else {
            throw new divisionByZeroException("Division by 0");
        }
    }
}