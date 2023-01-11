package cpt;

public class Datapoint {

    // Instance variables
    private String countryName;
    private String countryCode;
    private int year;
    private double HHDI;

    public Datapoint(String theCountryName, String theCountryCode, int theYear, double theHHDI) {
        this.countryName = theCountryName;
        this.countryCode = theCountryCode;
        this.year = theYear;
        this.HHDI = theHHDI;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYear() {
        return year;
    }

    public double getHHDI() {
        return HHDI;
    }

}
