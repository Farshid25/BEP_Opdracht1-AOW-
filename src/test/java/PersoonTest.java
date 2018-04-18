import AOW_opdracht.Persoon;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class PersoonTest {
    @Test
    public void checkSalaris(){
        Persoon persoon = new Persoon("Rafael", 1995, 25000, 1);
        double salaris = persoon.berekenInkomen(persoon.getInkomen(), persoon.getSchaal(), persoon.getGebJaar());
        Assert.assertEquals(9137,salaris, 0.05);
    }

}

//23 .  9137,5