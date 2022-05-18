import org.testng.Assert;
import org.testng.annotations.Test;



public class CalculatorTest {

    @Test
    void subtraction() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(20, calculator.subtraction(35, 15));

    }

    @Test
    void multiplication() {
        Calculator calculator = new Calculator();
         Assert.assertEquals(12, calculator.multiplication(3,4));

    }
}
