package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class PartiesApplication extends Application {
//    private HashMap<String, HashMap<Integer, Double>> values;
//
//    public PartiesApplication() {
//        this.values = dataReadFromFile("partiesdata.tsv");
//    }

    @Override
    public void start(Stage stage) throws IOException {
        
        List <String []> rows = new ArrayList <>();
        
        try {
        Files.lines(Paths.get("partiesdata.tsv"))
                .map(line -> line.split("\t"))
                .forEach(row -> rows.add(row));
        } catch (IOException e) {
            System.out.println("Failed to read the file partiesdata.tsv");
            
        }
        
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        xAxis.setLabel("Years");
        yAxis.setLabel("Support");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        for (int i = 1; i < rows.size(); i++) {
            String [] row = rows.get(i);
            
            XYChart.Series data = new XYChart.Series();
            data.setName(row[0]);
            
            for(int column = 1; column < row.length; column++) {
                String value = row [column];
                
                if(value.equals("-")) {
                    continue;
                }
                
            
            int year = Integer.parseInt(rows.get(0)[column]);
            data.getData().add(new XYChart.Data(year, Double.valueOf(value)));
        }
        
            lineChart.getData().add(data);
        }

        // display the line chart
        Scene view = new Scene(lineChart, 650, 450);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }

}
        
        
        
        
    
        

        
        
        
        

        

