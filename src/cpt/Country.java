package cpt;

import java.lang.reflect.Constructor;
import java.util.*;

import javafx.scene.chart.PieChart.Data;

public class Country {
    // Instance variables
    private String countryName;
    // private ArrayList<String> listCountries = new ArrayList<>();
    


    public Country(String theCountryName, HashMap<Integer, Double> theCountryValues) {
        this.countryName = theCountryName;
        
    }

    // public void setCountryValues() {
    //     for (int i = 0; i < Datacollection.getDataCollectionName())
    //} shall i do the hashmap setup during csvreading or in this step? it might be 
    // easier to do it earlier with the commas rather than now with the different appearance
}
