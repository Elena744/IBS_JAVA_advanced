package Action;
import Exception.*;

public class Subtraction implements Action{
    @Override
    public double act(double first, double second) throws dyvisionByZeroException {
        return first - second;
    }
}
