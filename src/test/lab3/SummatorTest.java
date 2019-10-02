package test.lab3;

import com.company.labs.lab3.Summator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummatorTest {
    @Test
    public void summFunctionTest() {
        Assertions.assertEquals(4, Summator.summFunction(2,2));
        Assertions.assertEquals(8, Summator.summFunction(6,2));

    }

    @Test
    public void multiplicationFunctionTest() {
        Assertions.assertEquals(4, Summator.multiplicationFunction(2,2));
    }
}
