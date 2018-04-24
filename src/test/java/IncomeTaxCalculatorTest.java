import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IncomeTaxCalculatorTest {

    @Before
    public void setUp() {
        IncomeTaxCalculator taxCalculator = new IncomeTaxCalculator();
    }

    @Test
    public void checkSalaris() {
        IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator("Rafael", 125000, 2, "January 5, 1994");
        double salaris = incomeTaxCalculator.berekenInkomen(incomeTaxCalculator.getInkomen(), incomeTaxCalculator.getSchaal(), incomeTaxCalculator.getYear());
        Assert.assertEquals(51062.5, salaris, 0.05);
    }
}