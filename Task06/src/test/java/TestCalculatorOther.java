import Action.*;
import org.junit.Assert;
import org.junit.Test;
import Exception.*;

public class TestCalculatorOther {
    // @BeforeClass

    @Test
    public void testObjectsIsSame() {
        Action calculatorActionAdd = new Addition();
        Action calculatorActionDiv = new Division();
        Assert.assertNotSame("одинаковые объекты", calculatorActionAdd, calculatorActionDiv);
    }

    @Test(expected = actionUnknownException.class)
    public void testIsActionUnknownException() throws actionUnknownException {
        Calculator calculator = new Calculator('w', 5, 5);
    }

}
