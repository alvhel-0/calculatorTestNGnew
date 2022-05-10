import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testSubtraction() {
    Calculator calculator = new Calculator();
    int result = calculator.subtraction(35, 15);
    assertEquals(result, 20);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(3, 4);
        assertEquals(result, 12);
    }
}