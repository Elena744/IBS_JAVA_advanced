import Action.*;
import org.junit.Assert;
import org.junit.Test;
import Exception.*;

public class TestCalculatorMultiplication implements TestCalculator {
    Action calculator = null;

    @Override
    @Test
    public void testIsObject() {
        calculator = new Multiplication();
        Assert.assertNotNull(calculator);
    }

    @Override
    @Test
    public void testActionWithPositiveNumbers() throws divisionByZeroException {
        calculator = new Multiplication();
        Assert.assertEquals(calculator.value(5, 2), 10, 0);
    }

    @Override
    @Test
    public void testActionWithNegativeNumbers() throws divisionByZeroException {
        calculator = new Multiplication();
        Assert.assertTrue("Ошибка при работе с отриц.числам", calculator.value(-5, -2) == 10);
    }

    @Override
    @Test
    public void testActionWithZero() throws divisionByZeroException {
        calculator = new Multiplication();
        Assert.assertTrue("Ошибка при работе с 0", calculator.value(0, 0) == 0);
    }

    @Override
    @Test
    public void testActionWithDoubleNumbers() throws divisionByZeroException {
        calculator = new Multiplication();
        Assert.assertEquals(calculator.value(1.5, 1.2), 1.8, 0.000000001);
    }

    @Test
    public void testReturnNotInt() throws divisionByZeroException {
        calculator = new Multiplication();
        Assert.assertNotEquals(0, calculator.value(0, 0));
    }

    @Test
    public void testReturnDouble() throws divisionByZeroException {
        calculator = new Multiplication();
        Assert.assertEquals("Результат выдается в виде дробных занчений", 0.0, calculator.value(5, 0), 0);
    }
}
