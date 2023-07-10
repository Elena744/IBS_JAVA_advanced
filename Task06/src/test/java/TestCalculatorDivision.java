import Action.*;
import org.junit.Assert;
import org.junit.Test;
import Exception.*;

public class TestCalculatorDivision implements TestCalculator {
    Action calculator = null;

    @Override
    @Test
    public void testIsObject() {
        calculator = new Division();
        Assert.assertNotNull(calculator);
    }

    @Override
    @Test
    public void testActionWithPositiveNumbers() throws divisionByZeroException {
        calculator = new Division();
        Assert.assertEquals(calculator.value(5, 2), 2.5000, 0);
    }

    @Override
    @Test
    public void testActionWithNegativeNumbers() throws divisionByZeroException {
        calculator = new Division();
        Assert.assertTrue("Ошибка при работе с отриц.числами", calculator.value(-5, -2) == 2.5000);
    }

    @Override
    @Test(expected = divisionByZeroException.class)
    public void testActionWithZero() throws divisionByZeroException {
        new Division().value(5, 0);
    }

    @Override
    @Test
    public void testActionWithDoubleNumbers() throws divisionByZeroException {
        calculator = new Division();
        Assert.assertEquals(calculator.value(1.5, 1.2), 1.25, 0);
    }
}
