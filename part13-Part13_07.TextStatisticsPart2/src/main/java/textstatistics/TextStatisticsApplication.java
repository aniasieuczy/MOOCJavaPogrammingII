package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

    @Override
        public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        final TextArea text = new TextArea();
        layout.setCenter(text);
        
        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        
        Label textComponent1 = new Label("Letters: 0");
        Label textComponent2 = new Label("Words: 0");
        Label textComponent3 = new Label("The longest word is: ");
        componentGroup.getChildren().add(textComponent1);
        componentGroup.getChildren().add(textComponent2);
        componentGroup.getChildren().add(textComponent3);
        
        layout.setBottom(componentGroup);
        
        text.textProperty().addListener(new ChangeListener<String>() {
                
            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                
                int characters = newValue.length();
                String [] parts = newValue.split(" ");
                int words = parts.length;
                String longest;
                longest = Arrays.stream(parts)
                        .sorted((s1, s2) -> s2.length() - s1.length() )
                        .findFirst()
                        .get(); 
                
                textComponent1.setText("Letters: " + characters );
                textComponent2.setText("Words: " + words);
                textComponent3.setText("The longest word is: " + longest );
  
                text.setText(newValue);
            }           
        });
 
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
 
    }

}
