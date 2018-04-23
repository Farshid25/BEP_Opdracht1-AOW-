package AOW_opdracht;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Persoon {

    private String name;
    private Date gebDatum;
    private double inkomen;
    private int schaal;

    public int getSchaal() {
        return schaal;
    }

    public void setSchaal(int schaal) {
        this.schaal = schaal;
    }

    public Persoon(String name, double inkomen, int schaal, String gbdtm) {
        this.name = name;
        this.inkomen = inkomen;
        this.schaal = schaal;
        setPersonDatum(gbdtm);
    }

    public void setPersonDatum(String gbdtm) {
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        try {
            this.gebDatum = format.parse(gbdtm);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getDatum(String gbdtm) {
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date date = new Date();
        try {
            date = format.parse(gbdtm);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public Date getGebDatum() {
        return gebDatum;
    }

    public int getMonth() {
        LocalDate localDate = gebDatum.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getMonthValue();
    }

    public int getYear() {
        LocalDate localDate = gebDatum.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear();
    }

    public void berekenAOW(Date gebdatum) {
        boolean result = false;
        if (getDatum("January 1, 1948").before(gebdatum)) {
            System.out.println("Start AOW in 2012 en leeftijd op 65");
        } else if (getDatum("December 31, 1947").after(gebdatum) || getDatum("December 1, 1948").before(gebdatum)) {
            System.out.println("Jaar AOW 2013 en leeftijd 65 + 1 maand");
        } else if (getDatum("November 30, 1948").after(gebdatum) || getDatum("November 1, 1949").before(gebdatum)) {
            System.out.println("Jaar 2014 en leeftijd 65 + 2 maanden");
        } else if (getDatum("October 31, 1949").after(gebdatum) || getDatum("October 1, 1950").before(gebdatum)) {
            System.out.println("Jaar 2015 en leeftijd 65 + 3 maanden");
        } else if (getDatum("September 30, 1950").after(gebdatum) || getDatum("July 1, 1951").before(gebdatum)) {
            System.out.println("Jaar 2016 en leeftijd 65 + 6 maanden");
        } else {
            System.out.println("Er is iets mis met de datum");
        }
    }

    public double berekenInkomen(double inkomen, int schaal, int gebJaar){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        double result = 0;
        boolean AOW_leeftijd = currentYear - gebJaar > 65;
        switch (schaal){
            case 1:
                if(!AOW_leeftijd) {
                    result = inkomen / 100 * 36.55;
                    break;
                } else {
                    berekenAOW(gebDatum);
                    result = inkomen / 100 * 18.56;
                    break;
                }
            case 2 : result = inkomen / 100 * 40.85;
                    break;
            case 3: result = inkomen / 100 * 40.85;
                    break;
            case 4: result = inkomen / 100 * 51.95;
                    break;
        }

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInkomen() {
        return inkomen;
    }

    public void setInkomen(double inkomen) {
        this.inkomen = inkomen;
    }
}
