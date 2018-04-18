package AOW_opdracht;

public class Persoon {

    private String name;
    private int gebJaar;
    private double inkomen;
    private int schaal;

    public int getSchaal() {
        return schaal;
    }

    public void setSchaal(int schaal) {
        this.schaal = schaal;
    }

    public Persoon(String name, int gebJaar, double inkomen, int schaal) {
        this.name = name;
        this.gebJaar = gebJaar;
        this.inkomen = inkomen;

        this.schaal = schaal;
    }

    public double berekenInkomen(double inkomen, int schaal, int gebJaar){
        double result = 0;
        int leeftijd;
        switch (schaal){
            case 1:
                leeftijd = (2018 - gebJaar);
                if(leeftijd <=64) {
                    result = inkomen / 100 * 36.55;
                    break;
                }else if(leeftijd >= 65) {
                    result = inkomen / 100 * 18.56;
                    break;
                }else{
                    return 0;
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

    public int getGebJaar() {
        return gebJaar;
    }

    public void setGebJaar(int gebJaar) {
        this.gebJaar = gebJaar;
    }

    public double getInkomen() {
        return inkomen;
    }

    public void setInkomen(double inkomen) {
        this.inkomen = inkomen;
    }
}
