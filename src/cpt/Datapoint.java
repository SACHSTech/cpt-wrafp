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
    
}
