package cpt;
import java.util.*;

public class Datacollection { 
    // Instance variables
    private String dataCollectionName;
    private String filePath;

    public Datacollection(String theDataCollectionName, String theFilePath, ArrayList<Datapoint> collecList) {
        this.dataCollectionName = theDataCollectionName;
        this.filePath = theFilePath;
    }

    public String getDataCollectionName() {
        return dataCollectionName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String toString() {
        return "Data Set Used: " + dataCollectionName + " (" + filePath + ")";
    }
}
