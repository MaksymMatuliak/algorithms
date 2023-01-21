package recursion_03;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFactorialWith6() {
        int result = Factorial.factorial(3);
        Assert.assertEquals(6, result);
    }

    @Test
    public void testFactorialWith1() {
        int result = Factorial.factorial(1);
        Assert.assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialWithNegativeNum() {
        Factorial.factorial(-100);
    }
}
