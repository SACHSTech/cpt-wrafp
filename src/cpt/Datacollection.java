package cpt;
import java.io.*;
import java.util.*;

public class Datacollection {
    public static void main(String[] args) throws IOException {
        ArrayList<Datapoint> dataSet = readCSV("src\\cpt\\human-development-index-escosura.csv");
        // System.out.println(dataSet);
    }
    
    
    private static ArrayList<Datapoint> readCSV(String filePath) throws IOException {
        ArrayList<Datapoint> dataSet = new ArrayList<>();
       
        try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
            String currentLine = fileRead.readLine();
            currentLine = fileRead.readLine();

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
                   
            }

            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            
        return dataSet;
    }
        
}
