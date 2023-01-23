package cpt;
import java.util.*;

public class Datacollection { 
    // Instance variables
    private String dataCollectionName;
    private String filePath;
    private ArrayList<Datapoint> dataCollectionVariable;

    public Datacollection(String theDataCollectionName, String theFilePath, ArrayList<Datapoint> theDataCollectionVariable) {
        this.dataCollectionName = theDataCollectionName;
        this.filePath = theFilePath;
        this.dataCollectionVariable = theDataCollectionVariable;
    }

    public String getDataCollectionName() {
        return dataCollectionName;
    }

    public ArrayList<Datapoint> getDataCollectionVariable() {
        return dataCollectionVariable;
    }

    public String getFilePath() {
        return filePath;
    }

    public String toString() {
        return "Data Set Used: " + dataCollectionName + " (" + filePath + ")";
    }
}
