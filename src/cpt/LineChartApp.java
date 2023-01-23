
/* ....Show License.... */
package cpt;
 
 
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
 
    private LineChart chart;
    private NumberAxis xAxis;
    private NumberAxis yAxis;
 
    public Parent createContent() {
        xAxis = new NumberAxis("Values for X-Axis", 1870, 2015, 10);
        xAxis.setLabel("Years");
        yAxis = new NumberAxis("Values for Y-Axis", 0, 1, 0.1);
        yAxis.setLabel("Historical Index of Human Development");

        for (int i = 0; i < dataSet.size(); i++) {
            String country = Datapoint.getCountryName();
            List<Datapoint> insertData = new ArrayList<>();
        
           
            XYChart.Series series = new XYChart.Series();
            series.setName(country);
            for (int j = 0; j < dataSet.size(); j++) {
                Datapoint curData = dataSet.get(j); // somehow get the object to instantiate so u can reference with getters
                // Add the data onto the series
                series.getData().add(new XYChart.Data(country, Datapoint.get(HIHD)));
            }
        
           

           
        }

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
        chart = new LineChart(xAxis, yAxis, lineChartData);
        return chart;
    }
 
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
