package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application  {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane ();
         
        HBox menu = new HBox();
    
        Button joke = new Button ("Joke");
        Button answer = new Button ("Answer");
        Button explanation = new Button ("Explanation");

        
        menu.getChildren().addAll(joke, answer, explanation);
        
        layout.setPrefSize(300, 180);
        layout.setTop(menu);
   
     
        Scene first = new Scene (layout);
        
        StackPane firstLayout = createView ("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView ("It has no teeth because it's a candy hahaha");
        
        joke.setOnAction((ActionEvent t) -> layout.setCenter(firstLayout));
        answer.setOnAction((ActionEvent t) -> layout.setCenter(secondLayout));
        explanation.setOnAction((ActionEvent t) -> layout.setCenter(thirdLayout));
      
        layout.setCenter(firstLayout);
        stage.setScene(first);
        stage.show();    
    }
    
    private StackPane createView (String text) {
        
        StackPane layout = new StackPane ();
        layout.setPrefSize (300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;   
    }
}
