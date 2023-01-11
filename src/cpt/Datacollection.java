package cpt;
import java.io.*;
import java.util.ArrayList;

public class Datacollection {
    
    


    public static void main(String[] args) throws IOException {
        // Initialize
        String filePath = "src\\cpt\\human-development-index-escosura.csv";

        String currentLine = "";
        
        
        try {
            BufferedReader fileRead = new BufferedReader(new FileReader(filePath));
            while (currentLine != null) {

                ArrayList<Datapoint> dataSet = new ArrayList<>();
                String[] values = currentLine.split(",");
                String countryName = values[0];
                String countryCode = values[1];
                int year = Integer.parseInt(values[2]);
                double HHDI = Double.parseDouble(values[3]);
                
                
            }
    
    
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
   
       
        
    
}
