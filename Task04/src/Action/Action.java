package Action;
import Exception.*;

public interface Action {
    double act (double first, double second) throws dyvisionByZeroException;
}
