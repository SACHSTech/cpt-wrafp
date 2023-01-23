package cpt;

import java.io.*;
import java.util.*;




public class CSVReader {

    private static String filePath = "src\\cpt\\human-development-index-escosura.csv";
    static HashMap<String, List<Datapoint>> countryData = new HashMap<>();
    static ArrayList<Datapoint> dataSet = new ArrayList<>();

    public static void main(String[] args) throws IOException {
       
        try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
            String currentLine = fileRead.readLine();
            currentLine = fileRead.readLine();
            String prevCountry = "";
    
            while (currentLine != null) {
                String[] values = currentLine.split(","); // seperates the values: name, year etc.
                currentLine = fileRead.readLine(); 
    
                // Assign values to appropriate variable types
                String countryName = values[0];
                String countryCode = values[1];
                int year = Integer.parseInt(values[2]);
                double HIHD = Double.parseDouble(values[3]);
                // System.out.println(countryName);
                
                // Create new instance of Datapoint that takes the corresponding values
                Datapoint addDataPoint = new Datapoint(countryName, countryCode, year, HIHD);
                dataSet.add(addDataPoint);

            
                if (!countryName.equals(prevCountry)) {
                    // If the country name is different, create new list
                    countryData.putIfAbsent(countryName, new ArrayList<>());


                countryData.get(countryName).add(addDataPoint);
                }
            }
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(countryData.get("Afghanistan"));
    }
}
