package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane layout = new BorderPane();
        
        Canvas paintingCanvas = new Canvas ();
        ColorPicker colorPallete = new ColorPicker();
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
//        painter.setFill(Color.WHITE);
        
        drawSmiley(painter);
       
        layout.setCenter(paintingCanvas);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
 
    }
    
    
    public void drawSmiley (GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        
        gc.fillRect(70, 60, 25, 25);//left eye
         
        gc.fillRect(200, 60, 25, 25);//right eye
        
        gc.fillRect(75, 200, 150, 25); //mouth line
        
        gc.fillRect(75, 175, 25, 25); //leeft mouth corner
        
         gc.fillRect(200, 175, 25, 25);
        
    }

}
