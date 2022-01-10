package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SavingsCalculatorApplication.class);
    }

    @Override
  public void start(Stage stage) {
        VBox slidersComponentGroup = new VBox();
 
        //Monthly Savings Setup
        BorderPane monthlySavings = new BorderPane();
        Label savingsLabel = new Label("Monthly savings");
        Label monthlyAmount = new Label("50");
        
        Slider savingsSlider = new Slider(25, 250, 25);
 
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setShowTickMarks(true);
 
        monthlySavings.setLeft(savingsLabel);
        monthlySavings.setCenter(savingsSlider);
        monthlySavings.setRight(monthlyAmount);
 
        
        //Interest Rate Setup
        BorderPane interestRate = new BorderPane();
        Label interestRateLabel2 = new Label("Yearly interest rate");
        Label rate = new Label("0");
        
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setMinorTickCount(10);
 
        interestRate.setLeft(interestRateLabel2);
        interestRate.setCenter(interestSlider);
        interestRate.setRight(rate);
 
        //Add savings and interest sliders to slider component
        slidersComponentGroup.getChildren().addAll(monthlySavings, interestRate);
 
        //Graph Setup
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
 
        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("Savings");
//        lineChart.setLegendVisible(false);
 
        XYChart.Series savingsData = new XYChart.Series();
        XYChart.Series savingsWithInterest = new XYChart.Series();
        
        lineChart.getData().add(savingsData);
        lineChart.getData().add(savingsWithInterest);
 
        savingsSlider.setOnMouseReleased(e -> {
            monthlyAmount.setText(String.valueOf(savingsSlider.getValue()));
            updateChartData(savingsSlider.getValue(), interestSlider.getValue(), savingsData, savingsWithInterest);
            
        });
 
        interestSlider.valueProperty().addListener((event) -> {
            
            String interestString = "" + interestSlider.getValue();
            if (interestString.length() > 4) {
                interestString = interestString.substring(0, 4);
            }
            rate.setText(interestString);
            updateChartData(savingsSlider.getValue(), interestSlider.getValue(), savingsData, savingsWithInterest);
        });
 
 
        BorderPane layout = new BorderPane();
        layout.setTop(slidersComponentGroup);
        layout.setCenter(lineChart);
 
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
  } 
 
    private void updateChartData(double monthlySavings, double interestRate, XYChart.Series savingsData, XYChart.Series savingsWithInterest) {
        savingsData.getData().clear();
        savingsWithInterest.getData().clear();
        
        savingsData.getData().add(new XYChart.Data(0, 0));
        savingsWithInterest.getData().add(new XYChart.Data(0, 0));
        
        double savings = 0;
        
        for(int i =1; i <= 30; i++) {
            savingsData.getData().add(new XYChart.Data(i, i * monthlySavings * 12));
            savings = savings + monthlySavings * 12;
            savings = savings * (1 + interestRate /100.0);
            
            savingsWithInterest.getData().add(new XYChart.Data(i, savings));
        }

    }

}
