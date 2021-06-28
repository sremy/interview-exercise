package exoFloat;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class CalculatorTest {

    @Test
    public void sum() {
        Locale.setDefault(Locale.US);

        Assert.assertEquals("2.0", Calculator.sumWithString("1.1", "0.4", "0.5"));
        Assert.assertEquals("2.01", Calculator.sumWithString("1.101", "0.404", "0.505"));
        Assert.assertEquals("100.45", Calculator.sumWithString("99.35", "1.10")); // KO 100.44999999999999
    }

    @Test
    public void sumWithFormat() {
        Locale.setDefault(Locale.US);

        Assert.assertEquals("2", Calculator.sumWithFormat("1.1", "0.4", "0.5"));
        Assert.assertEquals("2.01", Calculator.sumWithFormat("1.101", "0.404", "0.505"));
        Assert.assertEquals("2.0002", Calculator.sumWithFormat("1.0001", "1.0001")); // KO 2
        Assert.assertEquals("2.001", Calculator.sumWithFormat("1.1001", "0.4004", "0.5005")); // KO 2
        Assert.assertEquals("100.45", Calculator.sumWithFormat("99.35", "1.10"));
        Assert.assertEquals("0.3", Calculator.sumWithFormat("0.1", "0.2"));
    }
}