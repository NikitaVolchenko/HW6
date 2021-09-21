import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void test() {

        Calculator calculator = new Calculator();

        Calculator.Add add = new Calculator.Add();
        assertEquals(256, add.calc(255,1));

        Calculator.Sub sub = new Calculator.Sub();
        assertEquals(64, sub.calc(128, 64));

        Calculator.Mult mult = new Calculator.Mult();
        assertEquals(1024, mult.calc(64,16));

        Calculator.Div div = new Calculator.Div();
        assertEquals(-20, div.calc(100,-5));
    }

}