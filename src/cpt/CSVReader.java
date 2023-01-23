package cpt;

import java.io.*;
import java.util.*;


public class CSVReader {

    
    
    // private Datacollection chartDataHIHD = new Datacollection("chartDataHIHD", filePath, dataSetHIHD);
    public void Initialize() {
        // String filePath = "src\\cpt\\human-development-index-escosura.csv";
        // HashMap<String, List<Datapoint>> countryData = new HashMap<>();
    
        // try {
        //     ArrayList<Datapoint> dataSet = readCSV(filePath);
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
    }
    
    
    private static String filePath = "src\\cpt\\human-development-index-escosura.csv";
    static HashMap<String, List<Datapoint>> countryData = new HashMap<>();
    static ArrayList<Datapoint> dataSet = new ArrayList<>();
        
    
        
            
    

    public static void main(String[] args) throws IOException {
        
        // HashMap<String, ArrayList<Datapoint>> countryData = new HashMap<>();
       
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

                // ArrayList<Datapoint> tempArr = new ArrayList<>();
                // tempArr.add(new Datapoint(countryName, countryCode, year, HIHD));
                // countryData.put(countryName, tempArr);
            if (countryName.equals(prevCountry)) {
                countryData.get(countryName).addAll(dataSet);
            }
            else {
               countryData.putIfAbsent(countryName, new ArrayList<>());
            }

                
            //     prevCountry = countryName;  
            // }

            
            }
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }
    //     countryData.put("afghanistan", dataSet);
    //     System.out.println(countryData);
    //     // .get("Austria")
    // 

    // private static ArrayList<Datapoint> readCSV(String filePath) throws IOException {
    //     ArrayList<Datapoint> dataSet = new ArrayList<>();
    //     // HashMap<String, ArrayList<Datapoint>> countryData = new HashMap<>();
       
    //     try (BufferedReader fileRead = new BufferedReader(new FileReader(filePath))) {
    //         String currentLine = fileRead.readLine();
    //         currentLine = fileRead.readLine();
    //         String prevCountry = "";
    
    //         while (currentLine != null) {
    //             String[] values = currentLine.split(","); // seperates the values: name, year etc.
    //             currentLine = fileRead.readLine(); 
    
    //             // Assign values to appropriate variable types
    //             String countryName = values[0];
    //             String countryCode = values[1];
    //             int year = Integer.parseInt(values[2]);
    //             double HIHD = Double.parseDouble(values[3]);
    //             // System.out.println(countryName);
                
    //             // Create new instance of Datapoint that takes the corresponding values
    //             Datapoint addDataPoint = new Datapoint(countryName, countryCode, year, HIHD);
    //             dataSet.add(addDataPoint);

    //             // ArrayList<Datapoint> tempArr = new ArrayList<>();
    //             // tempArr.add(new Datapoint(countryName, countryCode, year, HIHD));
    //             // countryData.put(countryName, tempArr);
    //         if (countryName.equals(prevCountry)) {
    //             countryData.get(countryName).addAll(dataSet);
    //         }
    //         else {
    //            countryData.putIfAbsent(countryName, new ArrayList<>());
    //         }

                
    //         //     prevCountry = countryName;  
    //         // }

            
    //         }
    //         fileRead.close();
    //     }
    //     catch (FileNotFoundException e) {
    //         e.printStackTrace();
    //     }
            
    //     return dataSet;
    // }

    
    
}

// private void readCSV(String fileName) throws IOException {
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
    //                 dataSetHIHD.add(addDataPoint);
                        
    //             }
        
    //             fileRead.close();
    //         }
    //         catch (FileNotFoundException e) {
    //             e.printStackTrace();
    //         }
    //     }
    // }
