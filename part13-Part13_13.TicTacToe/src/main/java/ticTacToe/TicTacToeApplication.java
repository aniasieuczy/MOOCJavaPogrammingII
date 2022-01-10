package ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    
    private final Label turn;
    private Label gameEnd;
    private final Button [] buttons;
    private boolean x;
    private boolean finished;
    
    public TicTacToeApplication () {
        
        this.x = true;
        finished = false;
        this.turn = new Label("Turn: X");
        this.buttons = new Button [9];
          for(int i=0; i<= 8; i++) {
            buttons[i] = createButton();
        }     
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setPrefSize(300, 350);
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        
        grid.add(buttons[0], 1, 0);
        grid.add(buttons[1], 1, 1);
        grid.add(buttons[2], 1, 2);
        grid.add(buttons[3], 2, 0);
        grid.add(buttons[4], 2, 1);
        grid.add(buttons[5], 2, 2);
        grid.add(buttons[6], 3, 0);
        grid.add(buttons[7], 3, 1);
        grid.add(buttons[8], 3, 2);

        layout.setTop(turn);
        layout.setCenter(grid);
   

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
         
    }
        
        public Button createButton () {
            Button btn = new Button (" ");
            btn.setFont(Font.font("Monospaced", 40));
            
            btn.setOnAction((ActionEvent event) -> {
                if(finished) return;
                if(!btn.getText().equals(" ")) return;
            
                if(x) {
                    btn.setText("X");
                    turn.setText("Turn: O");
 
                    x = false;
                } else {
                    btn.setText("O");
                    turn.setText("Turn: X");
                    x = true;
                }
                
                
                if(gameWon() || gameOver()) {
                    turn.setText("The end!");
                    finished = true;
                }
            
                
//                int row = GridPane.getRowIndex(btn);
//                int column = GridPane.getColumnIndex(btn);


//btn.setDisable(true);
            });

        return btn;
    }   
        
        public boolean gameOver () {
            
            if(!buttons[0].getText().equals(" ") &&
              !buttons[1].getText().equals(" ") &&
              !buttons[2].getText().equals(" ") &&
              !buttons[3].getText().equals(" ") &&
              !buttons[3].getText().equals(" ") &&
              !buttons[4].getText().equals(" ") &&
              !buttons[5].getText().equals(" ") &&
              !buttons[6].getText().equals(" ") &&
              !buttons[7].getText().equals(" ") &&
              !buttons[8].getText().equals(" ")) {
                return true;
            }
              return false;  
            }
            
        public boolean gameWon () {
            
            if(!buttons[0].getText().equals(" ")) {
                if(buttons[0].getText().equals(buttons[1].getText()) && buttons[0].getText().equals(buttons[2].getText())) {
                    return true;
                }
            }
            if(!buttons[3].getText().equals(" ")) {
                if(buttons[3].getText().equals(buttons[4].getText()) && buttons[3].getText().equals(buttons[5].getText())) {
                    return true;
                }
            }
            if(!buttons[6].getText().equals(" ")) {
                if(buttons[6].getText().equals(buttons[7].getText()) && buttons[6].getText().equals(buttons[8].getText())) {
                    return true;
                }
            }    
            if(!buttons[0].getText().equals(" ")) {
                if(buttons[0].getText().equals(buttons[3].getText()) && buttons[0].getText().equals(buttons[6].getText())) {
                    return true;
                }
            }   
            if(!buttons[1].getText().equals(" ")) {
                if(buttons[1].getText().equals(buttons[4].getText()) && buttons[1].getText().equals(buttons[7].getText())) {
                    return true;
                }
            }
            if(!buttons[2].getText().equals(" ")) {
                if(buttons[2].getText().equals(buttons[5].getText()) && buttons[2].getText().equals(buttons[8].getText())) {
                    return true;
                }
            }
            return false;
            }
        
        
            
        }
        

//        for(int x= 1; x <= 3; x++) {
//            for(int y = 1; y <= 3; y++) {
//             grid.add(createButton(), x, y);