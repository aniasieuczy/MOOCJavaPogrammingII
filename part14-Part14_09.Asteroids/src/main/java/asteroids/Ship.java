/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;


import javafx.scene.shape.Polygon;

/**
 *
 * @author Ania
 */
public class Ship extends Character {
    
    
    public Ship(int x, int y) {
            super (new Polygon(-5,-5, -5, 5, 20, 0), x, y);
    }    
}


//    private Polygon character;
//    private Point2D movement;
//    
//    public Ship(int x, int y) {
//        this.character = new Polygon (-5, 5, 10, 0, -5, 5);
//        this.character.setTranslateX(x);
//        this.character.setTranslateY(y);
//        
//        this.movement = new Point2D(0, 0);
//    }
//    
//        public Polygon getCharacter() {
//        return character;
//    }
//
//    public void turnLeft() {
//        this.character.setRotate(this.character.getRotate() - 5);
//    }
//
//    public void turnRight() {
//        this.character.setRotate(this.character.getRotate() + 5);
//    }
//
//    public void move() {
//        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
//        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());
//    }
//    
//     public void accelerate () {
////        double changeX = Maths.cos(Math.toRadians(*angle in degrees*));
////        double changeY = Maths.sin(Math.toRadians(*angle in degrees*));
//
//        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
//        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));
//        
//        changeX = changeX * 0.05;
//        changeY = changeY + 0.05;
//        
//        this.movement = this.movement.add(changeX, changeY);
//    }  
//}