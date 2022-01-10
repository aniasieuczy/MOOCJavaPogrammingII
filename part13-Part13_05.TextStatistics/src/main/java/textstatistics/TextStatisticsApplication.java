package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea("text at center"));
        
        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        
        Label textComponent1 = new Label("Letters: 0");
        Label textComponent2 = new Label("Words: 0");
        Label textComponent3 = new Label("The longest word is: ");
        componentGroup.getChildren().add(textComponent1);
        componentGroup.getChildren().add(textComponent2);
        componentGroup.getChildren().add(textComponent3);
        
        layout.setBottom(componentGroup);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
        
        
        
        
        
        
        
        
        
    }

}
