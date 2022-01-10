package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
        System.out.println("Hello world!");
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        
        layout.setRight(new Label("EAST"));
        layout.setLeft(new Label("WEST"));
        layout.setBottom(new Label("SOUTH"));
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

}
