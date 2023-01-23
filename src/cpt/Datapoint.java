package cpt;

public class Datapoint {

    public static Object getHIHD;
    // Instance variables
    private String countryName;
    private String countryCode;
    private int year;
    private double HIHD;

    public Datapoint(String theCountryName, String theCountryCode, int theYear, double theHIHD) {
        this.countryName = theCountryName;
        this.countryCode = theCountryCode;
        this.year = theYear;
        this.HIHD = theHIHD;
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

    public double getHIHD() {
        return HIHD;
    }

    public String toString() {
        return getCountryName() + " (" + getCountryCode() + ") | Year: " + getYear() + " | HIHD: " + getHIHD() + "\n"; 
    }
}
