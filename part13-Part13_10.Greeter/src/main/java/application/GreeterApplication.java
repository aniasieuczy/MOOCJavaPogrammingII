package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        
        VBox layout = new VBox();
        Label instructions = new Label("Enter your name and start");
        TextField userInput = new TextField();
        Button start = new Button ("Start");
        layout.getChildren().addAll(instructions, userInput, start);
        Scene getName = new Scene(layout);
     
        HBox welcomeUser = new HBox();
        Label greet = new Label();
      
        welcomeUser.getChildren().addAll(greet);
        welcomeUser.setPrefSize(300, 180);
        welcomeUser.setAlignment(Pos.CENTER);
        final Scene welcomeUserWithName = new Scene(welcomeUser);
        
        start.setOnAction(new EventHandler <ActionEvent> () {
            public void handle(ActionEvent t) {
                greet.setText("Welcome " + userInput.getText() + "!");
                stage.setScene(welcomeUserWithName);
            } 
        });
        
        stage.setScene(getName);
        stage.show();

    }
}
