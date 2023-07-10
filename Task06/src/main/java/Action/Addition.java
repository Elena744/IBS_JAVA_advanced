package Action;
import Exception.*;

public class Addition implements Action{
    @Override
    public double value(double first, double second) throws divisionByZeroException {
        return first + second;
    }
}
