package Action;
import Exception.*;

public class Addition implements Action{
    @Override
    public double act(double first, double second) throws dyvisionByZeroException {
        return first + second;
    }
}
