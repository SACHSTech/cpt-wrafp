/* ....Show License.... */
package cpt;
 
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
 

/**
 * A chart that displays the upward trend of human development (quality of life) from 1870-2015 using HIHD
 * @author K.huang
 */
public class LineChartApp extends Application {
 
    private LineChart chart;
    private NumberAxis xAxis;
    private NumberAxis yAxis;
 
    public Parent createContent() {
        // Initialize the axes
		CategoryAxis xAxis = new CategoryAxis();
		NumberAxis yAxis = new NumberAxis();
        xAxis = new CategoryAxis();
        xAxis.setLabel("Year");
        yAxis = new NumberAxis("Historical Index of Human Development", 0, 1, 0.1);

        // The data which is separated into series, that correspond to each country (I was planning on automating this step with a for loop...
        // with getter methods from the data structures to get the values, but there were too many issues I could not troubleshoot)
       // LineChart linechart = new LineChart(xAxis, yAxis);  
        LineChart<String, Number> linechart = new LineChart<String, Number>(xAxis, yAxis);
        CSVReader insert = new CSVReader();

        for (int i = 0; i < insert.getSize(); i++) {
            String country = insert.getCountryName().get(i);
            List<Datapoint> dataList = insert.getDataName(country);
            // List<Datapoint> insertData = new ArrayList<>();
            XYChart.Series<String, Number> series = new XYChart.Series<>();
            series.setName(country);

            for (int j = 0; j < insert.getSize(); j++) {
                Datapoint graphData = dataList.get(j); // somehow get the object to instantiate so u can reference with getters
                int year = graphData.getYear();
                // Add the data onto the series
                series.getData().add(new XYChart.Data(year, graphData.getHIHD()));
            }
            // after adding all of country's data into a series, add that to the linechart
            series.setName(country);
            
        }

        linechart.setCreateSymbols(false);
        return linechart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.setTitle("Historical Index of Human Development, 1870 to 2015"); // The title of the window
        primaryStage.show();
    }
 
    
    public static void main(String[] args) {
        launch(args);
    }
 
}  
    /**
     * Unsuccessful attempt on trying to automatically insert data through the use of datastrucutres (Code below)
     */

    /* 
    public class LineChartApp extends Application {
    
        public Parent createContent() {
            
            LineChart<Number, Number> linechart = new LineChart<Number, Number>(xAxis, yAxis);
        
        

        return linechart;
       
        
    }
    */
       
        
    
        
        
         

		
 
    
 


