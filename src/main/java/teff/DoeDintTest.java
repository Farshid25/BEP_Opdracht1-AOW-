package teff;

import org.junit.Test;
import org.junit.Assert;

public class DoeDintTest {
    @Test
    public void checkHet(){
        DoeDing doeDing = new DoeDing();
        String iets = doeDing.doeHet();
        Assert.assertEquals(iets, "hi");
    }
}
