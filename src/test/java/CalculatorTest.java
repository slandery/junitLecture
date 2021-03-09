import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc;
    int num1;
    int num2;
    double dub1;
    double dub2;

    @Before
    public void setup(){
        calc = new Calculator();

    }

    @Test
    public void testAdd() {
        int num1 = 5;
        int num2 = 10;

        int sum = calc.add(num1, num2);

        assertEquals(15, sum, 0.0);
    }

    @Test
    public void testSubtract() {
        int num1 = 5;
        int num2 = 10;

        int dif = calc.subtract(num1, num2);

        assertEquals(-5, dif, 0.0);
    }

    @Test
    public void testDivide() {
        double num1 = 5;
        double num2 = 10;

        double quotient = calc.divide(num1, num2);

        assertEquals(0.5, quotient, 0.0);
    }

    @Test
    public void testMultiply() {
        int num1 = 5;
        int num2 = 10;

        int product = calc.multiply(num1, num2);

        assertEquals(50, product, 0.0);
    }

}
