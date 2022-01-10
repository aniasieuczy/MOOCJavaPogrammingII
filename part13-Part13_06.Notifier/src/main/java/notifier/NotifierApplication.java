package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
       final TextField textField = new TextField();
        Button button = new Button ("Update");
        final Label label = new Label();
        
        button.setOnAction(new EventHandler <ActionEvent> () {
            public void handle(ActionEvent t) {
                label.setText(textField.getText());
            }   
        });
        
    VBox layout = new VBox ();
    layout.setSpacing(20);
 
    layout.getChildren().addAll(textField, button, label);
    
    Scene view = new Scene(layout);
    stage.setScene(view);
    stage.show();
    }

}
