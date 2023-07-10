import org.junit.Test;
import Exception.*;

public interface TestCalculator {
    @Test
    void testIsObject();

    @Test
    void testActionWithPositiveNumbers() throws divisionByZeroException;

    @Test
    void testActionWithNegativeNumbers() throws divisionByZeroException;

    @Test
    void testActionWithZero() throws divisionByZeroException;

    @Test
    void testActionWithDoubleNumbers() throws divisionByZeroException;
}
