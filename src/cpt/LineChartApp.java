/* ....Show License.... */
package cpt;
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
		NumberAxis xAxis = new NumberAxis();
		NumberAxis yAxis = new NumberAxis();
        xAxis = new NumberAxis("Year", 1870, 2015, 10);
        yAxis = new NumberAxis("Historical Index of Human Development", 0, 1, 0.1);

        // The data which is separated into series, that correspond to each country (I was planning on automating this step with a for loop...
        // with getter methods from the data structures to get the values, but there were too many issues I could not troubleshoot)
        ObservableList<Series<? extends Number, Double>> lineChartData =
            FXCollections.observableArrayList(

                new LineChart.Series<>("Canada",
                    FXCollections.observableArrayList(
                    new XYChart.Data<>(1870, 0.24),
                    new XYChart.Data<>(1880, 0.23),
                    new XYChart.Data<>(1890, 0.25),
                    new XYChart.Data<>(1900, 0.27),
                    new XYChart.Data<>(1913, 0.32),
                    new XYChart.Data<>(1925, 0.37),
                    new XYChart.Data<>(1938, 0.41),
                    new XYChart.Data<>(1950, 0.47),
                    new XYChart.Data<>(1960, 0.53),
                    new XYChart.Data<>(1970, 0.59),
                    new XYChart.Data<>(1980, 0.60),
                    new XYChart.Data<>(1990, 0.71),
                    new XYChart.Data<>(2000, 0.75),
                    new XYChart.Data<>(2010, 0.85),
                    new XYChart.Data<>(2015, 0.88))),

                new LineChart.Series<>("India",
                    FXCollections.observableArrayList(
                    new XYChart.Data<>(1870, 0.03),
                    new XYChart.Data<>(1880, 0.03),
                    new XYChart.Data<>(1890, 0.04),
                    new XYChart.Data<>(1900, 0.04),
                    new XYChart.Data<>(1913, 0.04),
                    new XYChart.Data<>(1925, 0.06),
                    new XYChart.Data<>(1938, 0.08),
                    new XYChart.Data<>(1950, 0.11),
                    new XYChart.Data<>(1960, 0.14),
                    new XYChart.Data<>(1970, 0.17),
                    new XYChart.Data<>(1980, 0.20),
                    new XYChart.Data<>(1990, 0.23),
                    new XYChart.Data<>(2000, 0.27),
                    new XYChart.Data<>(2010, 0.33),
                    new XYChart.Data<>(2015, 0.38))),

                new LineChart.Series<>("China",
                    FXCollections.observableArrayList(
                    new XYChart.Data<>(1870, 0.03),
                    new XYChart.Data<>(1880, 0.04),
                    new XYChart.Data<>(1890, 0.05),
                    new XYChart.Data<>(1900, 0.04),
                    new XYChart.Data<>(1913, 0.04),
                    new XYChart.Data<>(1925, 0.05),
                    new XYChart.Data<>(1938, 0.09),
                    new XYChart.Data<>(1950, 0.12),
                    new XYChart.Data<>(1960, 0.15),
                    new XYChart.Data<>(1970, 0.25),
                    new XYChart.Data<>(1980, 0.29),
                    new XYChart.Data<>(1990, 0.31),
                    new XYChart.Data<>(2000, 0.39),
                    new XYChart.Data<>(2010, 0.48),
                    new XYChart.Data<>(2015, 0.54))),

                    new LineChart.Series<>("South Korea",
                    FXCollections.observableArrayList(
                    new XYChart.Data<>(1870, 0.02),
                    new XYChart.Data<>(1880, 0.03),
                    new XYChart.Data<>(1890, 0.03),
                    new XYChart.Data<>(1900, 0.03),
                    new XYChart.Data<>(1913, 0.04),
                    new XYChart.Data<>(1925, 0.08),
                    new XYChart.Data<>(1938, 0.16),
                    new XYChart.Data<>(1950, 0.19),
                    new XYChart.Data<>(1960, 0.25),
                    new XYChart.Data<>(1970, 0.32),
                    new XYChart.Data<>(1980, 0.40),
                    new XYChart.Data<>(1990, 0.51),
                    new XYChart.Data<>(2000, 0.63),
                    new XYChart.Data<>(2010, 0.81),
                    new XYChart.Data<>(2015, 0.85)))
            );
       
        chart = new LineChart(xAxis, yAxis, lineChartData);
        return chart;
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
        
        // LineChart linechart = new LineChart(xAxis, yAxis);  
        // LineChart<Integer, Number> linechart = new LineChart<Integer, Number>(xAxis, yAxis);

        for (int i = 0; i < CSVReader.getSize(); i++) {
            String country = CSVReader.getCountryName().get(i);
            List<Datapoint> dataList = CSVReader.getDataSet(country);
            // List<Datapoint> insertData = new ArrayList<>();
            XYChart.Series series = new XYChart.Series();
            series.setName(country);

            for (int j = 0; j < CSVReader.getSize(); j++) {
                Datapoint graphData = dataList.get(j); // somehow get the object to instantiate so u can reference with getters
                int year = graphData.getYear();
                // Add the data onto the series
                series.getData().add(new XYChart.Data<>(year, graphData.getHIHD()));
            }
            // after adding all of country's data into a series, add that to the linechart
            series.setName(country);
            linechart.getData().add(series);

        }

        return linechart;
       
        
    }
    */
       
        
    
        
        
         

		
 
    
 


