package cpt;

import java.lang.reflect.Constructor;
import java.util.*;

public class Country {
    // Instance variables
    private String countryName;
    private HashMap<Integer, Double> countryValues = new HashMap<>();

    public Country(String theCountryName, HashMap<Integer, Double> theCountryValues) {
        this.countryName = theCountryName;
        this.countryValues = theCountryValues;
    }
}
