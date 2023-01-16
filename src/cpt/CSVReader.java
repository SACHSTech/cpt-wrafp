package cpt;

import java.io.*;
import java.util.*;


public class CSVReader {
    
    public static void main(String[] args) throws IOException {
        String filePath = "src\\cpt\\human-development-index-escosura.csv";
        ArrayList<Datapoint> dataSetHIHD = new ArrayList<>();
        Datacollection chartDataHIHD = new Datacollection("chartDataHIHD", filePath, dataSetHIHD);
        

        System.out.println(chartDataHIHD);
        
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
                dataSetHIHD.add(addDataPoint);
                    
            }
    
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
    
    
    // private static ArrayList<Datapoint> readCSV(String filePath) throws IOException {
    //     ArrayList<Datapoint> dataSet = new ArrayList<>();
       
//         try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
//             String currentLine = fileRead.readLine();
//             currentLine = fileRead.readLine();
    
//             while (currentLine != null) {
//                 String[] values = currentLine.split(","); // seperates the values: name, year etc.
//                 currentLine = fileRead.readLine(); 
    
//                 // Assign values to appropriate variable types
//                 String countryName = values[0];
//                 String countryCode = values[1];
//                 int year = Integer.parseInt(values[2]);
//                 double HIHD = Double.parseDouble(values[3]);
//                 // System.out.println(countryName);
                
//                 // Create new instance of Datapoint that takes the corresponding values
//                 Datapoint addDataPoint = new Datapoint(countryName, countryCode, year, HIHD);
//                 dataSet.add(addDataPoint);
                   
//             }
    
//             fileRead.close();
//         }
//         catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
            
//         return dataSet;
//     }
// }
