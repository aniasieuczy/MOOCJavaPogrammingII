package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author Ania
 */
public class ButtonAndLabelApplication extends Application {
    
    
    public void start (Stage window) {
        window.setTitle("Button and Label Application");
        
        Label myLabel = new Label ("Ania's first button and label application");
        Button myButton = new Button ("This is a button");
        
//        myLabel.setTextAlignment(TextAlignment.RIGHT);
    


        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(myButton);
        componentGroup.getChildren().add(myLabel);
        
        myButton.setTextAlignment(TextAlignment.RIGHT);
        
        Scene scene = new Scene(componentGroup);
        
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
        System.out.println("Hello world!");
    }


}
