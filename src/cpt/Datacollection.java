package cpt;
import java.io.*;

public class Datacollection {
    public static void main(String[] args) {
        
    }

    private void ParseData(String fileName) {
        BufferedReader thefile = new BufferedReader(new FileReader("human-development-index-escosura.csv"))
        
        String strStuff = "";

        while (strStuff != null) {
            strStuff = thefile.readLine();
            if (strStuff != null) {
                System.out.println("Output: " + strStuff);
            }
        }
        thefile.close();
    }
}
