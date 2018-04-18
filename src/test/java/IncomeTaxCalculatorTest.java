import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncomeTaxCalculatorTest {

    private IncomeTaxCalculator taxCalculator;

    @org.junit.Before
    public void setUp() {

        //taxCalculator = new IncomeTaxCalculator();
    }

    @Test
    public void shouldReturnZeroAsThereIsNoTaxPay() {
        Assert.assertSame(4,2);
        //assertThat(taxCalculator.calculateTax(5));
    }
}