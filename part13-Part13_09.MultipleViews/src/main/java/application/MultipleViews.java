package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(final Stage stage) throws Exception {
        
        Button go2scene = new Button ("The second view!"); 
        Button go3rdScene = new Button ("To the third view!");
        Button back = new Button ("Go to first view!");
       
        BorderPane layout1 = new BorderPane();
        Label firstView = new Label ("First view!");
        layout1.setTop(firstView);
        layout1.setCenter(go2scene);
        final Scene first = new Scene(layout1, 300, 300);
        
        VBox layout2 = new VBox();
        Label from2scene = new Label("Second view!");
        layout2.getChildren().addAll(go3rdScene, from2scene);
        Scene second = new Scene(layout2, 300, 300); 
        
        GridPane layout3 = new GridPane();
        Label thirdView = new Label ("Third view!");
        GridPane.setConstraints(thirdView, 0, 0);
        GridPane.setConstraints(back, 1, 1);
        layout3.getChildren().addAll(thirdView, back);
        layout3.setPrefSize(300, 180);
        layout3.setAlignment(Pos.BOTTOM_CENTER);
        final Scene third = new Scene(layout3);
          
        go2scene.setOnAction(new EventHandler <ActionEvent> () {
            public void handle(ActionEvent event) {
                stage.setScene(second);
            }
        });

        go3rdScene.setOnAction(new EventHandler <ActionEvent>() {
            public void handle(ActionEvent t) {
                stage.setScene(third);
            }
        }); 
        
        back.setOnAction(new EventHandler <ActionEvent> () {
            public void handle(ActionEvent t) {
                stage.setScene(first);
            } 
        });
        
            stage.setScene(first);
            stage.show();
   
    }

}
