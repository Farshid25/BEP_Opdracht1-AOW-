import AOW_opdracht.Persoon;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class PersoonTest {
    @Test
    public void checkSalaris(){
        Persoon persoon = new Persoon("Rafael", 125000, 2, "January 5, 1994");
        double salaris = persoon.berekenInkomen(persoon.getInkomen(), persoon.getSchaal(), persoon.getYear());
        Assert.assertEquals(9137, salaris, 0.05);
    }

}

//23 .  9137,5