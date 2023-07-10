package Action;
import Exception.*;

public interface Action {
    double value (double first, double second) throws divisionByZeroException;

    static void toString (double value){
        System.out.println("Result: " + String.format("%.4f", value));
    }
}
