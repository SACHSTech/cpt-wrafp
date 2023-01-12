package cpt;

public class Datapoint {

    // Instance variables
    private String countryName;
    private String countryCode;
    private String year;
    private String HIHD;

    public Datapoint(String theCountryName, String theCountryCode, String theYear, String theHIHD) {
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

    public String getYear() {
        return year;
    }

    public String getHIHD() {
        return HIHD;
    }

    public String toString() {
        return getCountryName() + " (" + getCountryCode() + ") | Year: " + getYear() + " | HIHD: " + getHIHD() + "\n"; 
    }
}
