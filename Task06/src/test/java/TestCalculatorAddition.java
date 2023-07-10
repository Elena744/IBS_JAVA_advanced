import Action.*;
import org.junit.Assert;
import org.junit.Test;
import Exception.*;

public class TestCalculatorAddition implements TestCalculator {
    Action calculator = null;

    @Override
    @Test
    public void testIsObject() {
        calculator = new Addition();
        Assert.assertNotNull(calculator);
    }

    @Override
    @Test
    public void testActionWithPositiveNumbers() throws divisionByZeroException {
        calculator = new Addition();
        Assert.assertEquals(calculator.value(2, 5), 7, 0);
    }

    @Override
    @Test
    public void testActionWithNegativeNumbers() throws divisionByZeroException {
        calculator = new Addition();
        Assert.assertTrue("Ошибка при работе с отриц.числами", calculator.value(-2, -5) == -7);
    }

    @Override
    @Test
    public void testActionWithZero() throws divisionByZeroException {
        calculator = new Addition();
        Assert.assertTrue("Ошибка при работе с 0", calculator.value(0, 0) == 0);
    }

    @Override
    @Test
    public void testActionWithDoubleNumbers() throws divisionByZeroException {
        calculator = new Addition();
        Assert.assertEquals(calculator.value(1.5, 1.2), 2.7, 0);
    }
}
