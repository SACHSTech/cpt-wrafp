package cpt;

import java.lang.reflect.Constructor;
import java.util.*;

import javafx.scene.chart.PieChart.Data;

public class Country {
    // Instance variables
    private String countryName;
    private HashMap<Integer, Double> countryValues = new HashMap<>();

    public Country(String theCountryName, HashMap<Integer, Double> theCountryValues) {
        this.countryName = theCountryName;
        this.countryValues = theCountryValues;
    }

    // public void setCountryValues() {
    //     for (int i = 0; i < Datacollection.getDataCollectionName())
    //} shall i do the hashmap setup during csvreading or in this step? it might be 
    // easier to do it earlier with the commas rather than now with the different appearance
}
