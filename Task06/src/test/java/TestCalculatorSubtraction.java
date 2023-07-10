import Action.*;
import org.junit.Assert;
import org.junit.Test;
import Exception.*;

public class TestCalculatorSubtraction implements TestCalculator {
    Action calculator = null;

    @Override
    @Test
    public void testIsObject() {
        calculator = new Subtraction();
        Assert.assertNotNull(calculator);
    }

    @Override
    @Test
    public void testActionWithPositiveNumbers() throws divisionByZeroException {
        calculator = new Subtraction();
        Assert.assertEquals(calculator.value(5, 2), 3, 0);
    }

    @Override
    @Test
    public void testActionWithNegativeNumbers() throws divisionByZeroException {
        calculator = new Subtraction();
        Assert.assertTrue("Ошибка при работе с отриц.числами", calculator.value(-5, -2) == -3);
    }

    @Override
    @Test
    public void testActionWithZero() throws divisionByZeroException {
        calculator = new Subtraction();
        Assert.assertTrue("Ошибка при работе с 0", calculator.value(0, 0) == 0);
    }

    @Override
    @Test
    public void testActionWithDoubleNumbers() throws divisionByZeroException {
        calculator = new Subtraction();
        Assert.assertEquals(calculator.value(1.5, 1.2), 0.3, 0.000000001);
    }
}
