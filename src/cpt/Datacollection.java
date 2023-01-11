package cpt;
import java.io.*;

public class Datacollection {
    
    


    public static void main(String[] args) throws IOException {
        // Initialize
        String filePath = "src\\cpt\\human-development-index-escosura.csv";

        String currentLine = "";
        
        
        try {
            BufferedReader fileRead = new BufferedReader(new FileReader(filePath));
            while (currentLine != null) {
                currentLine = fileRead.readLine();
                System.out.println(currentLine);
                // if (currentLine != null) {
                //     System.out.println("Output: " + currentLine);
                // }
            }
    
    
            fileRead.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
   
       
        
    
}
