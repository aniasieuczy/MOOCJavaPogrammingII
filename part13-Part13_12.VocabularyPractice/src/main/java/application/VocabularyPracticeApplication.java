package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    
    private Dictionary dictionary;
    
    @Override
    public void init () {
        this.dictionary = new Dictionary ();
    }


    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setSpacing(10);
        
        Button enter = new Button ("Enter new words");
        Button practice = new Button ("Practice");
        
        menu.getChildren().addAll(enter, practice);
        
        layout.setTop(menu);
        
        InputView inputLayout = new InputView (dictionary);
        PracticeView practiceLayout = new PracticeView (dictionary);
        
        enter.setOnMouseClicked((event) -> layout.setCenter(inputLayout.getView()));  
        
        practice.setOnMouseClicked ((event) -> layout.setCenter(practiceLayout.getView()));
        
        layout.setCenter(inputLayout.getView());
        
        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
        stage.show();
   
    }
        
//        private StackPane createView (String text) {
//          StackPane layout = new StackPane();
//          layout.setAlignment(Pos.CENTER);
//          layout.setPrefSize(180, 300);
//          layout.getChildren().add(new Label(text));
//          
//          return layout;
//        }
}
        
        
        
        
       
    

