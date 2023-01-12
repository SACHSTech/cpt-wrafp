package cpt;
import java.io.*;
import java.util.*;

public class Datacollection {
    public static void main(String[] args) throws IOException {
        ArrayList<Datapoint> dataSet = readCSV("src\\cpt\\human-development-index-escosura.csv");
        System.out.println(dataSet);
        // System.out.println(dataSet.indexOf());
    }
    
    
    private static ArrayList<Datapoint> readCSV(String filePath) throws IOException {
        ArrayList<Datapoint> dataSet = new ArrayList<>();

        
        try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
            String currentLine = fileRead.readLine();

            while (currentLine != null) {
                String[] values = currentLine.split(","); // new index everytime parses a comma

                currentLine = fileRead.readLine(); 
      
                String countryName = values[0];
                String countryCode = values[1];
                String year = values[2];
                String HIHD = values[3];
                
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
