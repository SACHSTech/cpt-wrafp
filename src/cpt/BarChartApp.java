/* ....Show License.... */
package cpt;
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
 
 
/**
 * A chart that displays the comparison of human development between 3 different countries (quality of life) from 1870-2015 using HIHD
 * @author K.huang
 */
public class BarChartApp extends Application {
 
    private BarChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
   
      public Parent createContent() {
          String[] years = {"1900", "1950", "2015"};
          xAxis = new CategoryAxis();
          xAxis.setCategories(FXCollections.<String>observableArrayList(years));
          yAxis = new NumberAxis("HIHD (Historical Index of Human Development)", 0.0, 1, 1.0);

          ObservableList<BarChart.Series> barChartData =
              FXCollections.observableArrayList(

                  new BarChart.Series("Canada",
                      FXCollections.observableArrayList(
                      new BarChart.Data(years[0], 0.27),
                      new BarChart.Data(years[1], 0.47),
                      new BarChart.Data(years[2], 0.88))),

                  new BarChart.Series("India",
                      FXCollections.observableArrayList(
                      new BarChart.Data(years[0], 0.04),
                      new BarChart.Data(years[1], 0.11),
                      new BarChart.Data(years[2], 0.38))),

                  new BarChart.Series("South Korea",
                      FXCollections.observableArrayList(
                      new BarChart.Data(years[0], 0.03),
                      new BarChart.Data(years[1], 0.19),
                      new BarChart.Data(years[2], 0.85)))
              );
          chart = new BarChart(xAxis, yAxis, barChartData, 25.0d);
          return chart;
      }
   
      @Override public void start(Stage primaryStage) throws Exception {
          primaryStage.setScene(new Scene(createContent()));
          primaryStage.show();
      }
   
      /**
       * Java main for when running without JavaFX launcher
       */
      public static void main(String[] args) {
          launch(args);
      }
}