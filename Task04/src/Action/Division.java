package Action;
import Exception.*;

public class Division implements Action{
    @Override
    public double act(double first, double second) throws dyvisionByZeroException{
        if (second != 0) {
            return first / second;
        } else {
            throw new dyvisionByZeroException("Division by 0");
        }
    }
}
