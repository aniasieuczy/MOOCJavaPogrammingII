/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


/**
 *
 * @author Ania
 */
public class PracticeView {
    
    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }
    
    public Parent getView () {
        GridPane layout = new GridPane();
        String word = dictionary.getRandomWord();
        Label instruction = new Label("Translate the word " + "'" + word + "'");
        TextField wordTranslation = new TextField();
        Button check = new Button ("Check");
        Label feedback = new Label ();
        
        layout.add(instruction, 0, 0);
        layout.add(wordTranslation, 0, 1);
        layout.add(check, 0, 2);
        layout.add(feedback, 0, 3);
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
//        layout.setPrefSize(300, 180);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        
        check.setOnMouseClicked((event) -> {
            String translation = wordTranslation.getText();
            if(dictionary.getWord(word).equals(translation)) {
                feedback.setText("Correct!");
                } else {
                feedback.setText("Incorrect! The translation of the word " + "'" + word + "' is" + 
                        "'" + dictionary.getWord(word) + "'");
                return;
            }
            
            this.word = this.dictionary.getRandomWord();
            instruction.setText("Translate the word " + this.word);
            wordTranslation.clear();
        });
        return layout;
        }  
}
