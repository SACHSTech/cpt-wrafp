package cpt;

import java.io.*;
import java.util.*;

/**
 * This class takes in data from a .csv file and stores the data into an arraylist and a hashmap. 
 * Also, includes getter methods and constructor to reference in other classes
 * @author K.huang
 */
public class CSVReader {
    static String filePath = "src\\cpt\\human-development-index-escosura.csv"; // relative path of the .csv file

    // Initialize Data Structures
    private HashMap<String, List<Datapoint>> countryData = new HashMap<>();
    private ArrayList<Datapoint> dataSet = new ArrayList<>();
    private ArrayList<String> listCountries = new ArrayList<>();

    public static void main(String[] args) {
        try {
            readCSV(filePath);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void readCSV(String filePath) throws IOException {
        
        HashMap<String, List<Datapoint>> countryData = new HashMap<>();
        ArrayList<Datapoint> dataSet = new ArrayList<>();
        ArrayList<String> listCountries = new ArrayList<>();
       
        try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
            String currentLine = fileRead.readLine();
            currentLine = fileRead.readLine();
            String prevCountry = "";
    
            // Read the .csv line by line with BufferedReader, keep looping until no more data
            while (currentLine != null) {
                String[] values = currentLine.split(","); // seperates the values: name, year etc.
                currentLine = fileRead.readLine(); 
    
                // Assign values to appropriate variable types
                String countryName = values[0];
                String countryCode = values[1];
                int year = Integer.parseInt(values[2]);
                double HIHD = Double.parseDouble(values[3]);
                
                // Create new instance of Datapoint that takes the corresponding values
                Datapoint addDataPoint = new Datapoint(countryName, countryCode, year, HIHD);

                // Add the instance into an arraylist that stores the data
                dataSet.add(addDataPoint);

                // Add the data into hashmap and countryName arraylist
                if (!countryName.equals(prevCountry)) {
                    countryData.putIfAbsent(countryName, new ArrayList<>()); // create a new arraylist for every corresponding country
                    listCountries.add(countryName);
                }
                countryData.get(countryName).add(addDataPoint);
                
            }
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }    


    /**
     * @return size() of the hashmap 
     */
    public int getSize() {
        return this.countryData.size();
    }

    /**
     * @return countryName
     */
    public ArrayList<String> getCountryName() {
        return this.listCountries;
    }

    public ArrayList<Datapoint> getDataSet() {
        return this.dataSet;
    }

    /**
     * @param countryName
     * @return the full list of data that corresponds to a country 
     */
    public List<Datapoint> getDataName(String countryName) {
        return this.countryData.get(countryName);
    }
}


