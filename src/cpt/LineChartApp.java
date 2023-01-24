
/* ....Show License.... */
package cpt;
 
 
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
 

/**
 * A chart in which lines connect a series of data points. Useful for viewing
 * data trends over time.
 */
public class LineChartApp extends Application {
 
    public Parent createContent() {
        // Initialize the axes
		NumberAxis xAxis = new NumberAxis();
		NumberAxis yAxis = new NumberAxis();
		
		xAxis.setLabel("Year");
		yAxis.setLabel("Historical Index of Human Development");
        xAxis = new NumberAxis("Values for X-Axis", 1870, 2015, 10);
        xAxis.setLabel("Years");
        yAxis = new NumberAxis("Values for Y-Axis", 0, 1, 0.1);
        yAxis.setLabel("Historical Index of Human Development");

       
    
    }
        /*
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
        // ObservableList<XYChart.Series<Integer,Double>> lineChartData = FXCollections.observableArrayList(
        //         new LineChart.Series<>("Series 1", FXCollections.observableArrayList(
                                       
        //             new XYChart.Data<>(1950, 0.04),
        //             new XYChart.Data<>(1, 1.4),
        //             new XYChart.Data<>(2, 1.9),
        //             new XYChart.Data<>(2, 2.3),
        //             new XYChart.Data<>(2, 0.5))),

        //         new LineChart.Series<>("Series 2", FXCollections.observableArrayList(
                                       
        //             new XYChart.Data<>(0, 1.6),
        //             new XYChart.Data<>(0, 0.4),
        //             new XYChart.Data<>(1, 2.9),
        //             new XYChart.Data<>(2, 1.3),
        //             new XYChart.Data<>(2, 0.9)))
        //     );
        // chart = new LineChart(xAxis, yAxis, lineChartData);
        
    }
         */

		
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.setTitle("Historical Index of Human Development, 1870 to 2015");
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
 
}

