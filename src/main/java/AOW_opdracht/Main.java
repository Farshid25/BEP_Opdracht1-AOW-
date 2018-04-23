package AOW_opdracht;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Persoon p1 = new Persoon("Mstr", 120000, 2, "January 2, 1999");
        System.out.println(p1.getMonth());
        System.out.println(p1.getYear());
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        double result = 0;
        boolean AOW_leeftijd = currentYear - 1850 > 65;
        System.out.println(AOW_leeftijd);
    }
}
