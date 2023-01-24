package cpt;

/**
 * Datapoint class
 * @author K.huang
 */
public class Datapoint {

    // Instance variables
    private String countryName;
    private String countryCode;
    private int year;
    private double HIHD;

    /**
     * Constructor - creates new instance of a datapoint
     * @param theCountryName - the name of the country
     * @param theCountryCode - the 3-letter country code (eg. USA)
     * @param theYear - the year of the data
     * @param theHIHD - the "quality of life" of that corresponding year
     */
    public Datapoint(String theCountryName, String theCountryCode, int theYear, double theHIHD) {
        this.countryName = theCountryName;
        this.countryCode = theCountryCode;
        this.year = theYear;
        this.HIHD = theHIHD;
    }

    
    /**
     * @return country name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @return country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the "quality of life" of that corresponding year
     */
    public double getHIHD() {
        return HIHD;
    }

    /**
    * @return a formatted version of the Datapoint
    */
    public String toString() {
        return getCountryName() + " (" + getCountryCode() + ") | Year: " + getYear() + " | HIHD: " + getHIHD() + "\n"; 
    }
}
