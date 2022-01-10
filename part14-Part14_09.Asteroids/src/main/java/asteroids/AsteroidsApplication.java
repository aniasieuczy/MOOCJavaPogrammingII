package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {
    
    public static int WIDTH = 300;
    public static int HEIGHT = 200;


    public static void main(String[] args) {
        System.out.println("Hello, world!");
        launch(AsteroidsApplication.class);
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

    @Override
    public void start(Stage stage) throws Exception {
        
//creating the game window
        Pane gameLayout = new Pane();
        gameLayout.setPrefSize(WIDTH, HEIGHT);
        
        AtomicInteger points = new AtomicInteger();
        Text text = new Text(10, 20, "Points: " + points);
        gameLayout.getChildren().add(text);
        
        
       
//creating the ship
        Ship ship = new Ship (WIDTH / 2, HEIGHT / 2);
        gameLayout.getChildren().add(ship.getCharacter());

 //multiple asteroids             
        List <Asteroid> asteroids = new ArrayList <>();
        for(int i = 0; i < 5; i++) {
            Random random = new Random();
            Asteroid asteroid = new Asteroid (random.nextInt(WIDTH / 3), random.nextInt(HEIGHT / 3));
            asteroids.add(asteroid);   
        }
        asteroids.forEach(asteroid -> gameLayout.getChildren().add(asteroid.getCharacter()));
        
//creating an asteroid
//         Asteroid asteroid = new Asteroid (50, 50);
//         gameLayout.getChildren().add(asteroid.getCharacter());         
//         asteroid.turnRight();
//         asteroid.turnRight();
//         asteroid.accelerate();
//         asteroid.accelerate();

//projectiles
        List <Projectile> projectiles = new ArrayList<>();

        Scene scene = new Scene(gameLayout);

//turning the ship 
        Map <KeyCode, Boolean> pressedKeys = new HashMap<>();
      
        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
            });
                
        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });
        
//moving the ship         
        new AnimationTimer() {
            
                   @Override
            public void handle(long now) {
                
                  if(pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }
                
                if(pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }
                
                if(pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }
                ship.move();
                
                if(pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3) {
                    Projectile projectile = new Projectile ((int)ship.getCharacter().getTranslateX(), (int)ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);
                    
                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));
                    
                    gameLayout.getChildren().add(projectile.getCharacter());
                }
                
                asteroids.forEach(asteroid -> asteroid.move());
//                asteroid.move(); 
                asteroids.forEach(asteroid -> {
                    if(ship.collide(asteroid)) {
                        stop();
                    }
                });
                    
                projectiles.forEach(projectile -> projectile.move());
                

                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if(projectile.collide(asteroid)) {
                            projectile.setAlive(Boolean.FALSE);
                            asteroid.setAlive(Boolean.FALSE);
                        }
                    });
                    if(!projectile.isAlive()) {
                    text.setText("Points: " + points.addAndGet(1000));   
                }
                });

//                text.setText("Points: " + points.addAndGet(1000));
                
                projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .forEach(projectile -> gameLayout.getChildren().remove(projectile.getCharacter()));
                
                projectiles.removeAll(projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .collect(Collectors.toList()));
                
                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> gameLayout.getChildren().remove(asteroid.getCharacter()));
                asteroids.removeAll(asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .collect(Collectors.toList()));
                
                if(Math.random() < 0.005) {
                    Asteroid asteroid = new Asteroid (WIDTH, HEIGHT);
                    if(!asteroid.collide(ship)) {
                        asteroids.add(asteroid);
                        gameLayout.getChildren().add(asteroid.getCharacter());
                    }
                }


                
            }
        }.start();
        
//the collision between the ship and an asteroid

        //staying within the window

        //adding points
        // continous adding of asteroids

        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }
}


//                projectiles.forEach(projectile -> {
//                    List <Asteroid> collisions = asteroids.stream()
//                            .filter(asteroid -> asteroid.collide(projectile))
//                            .collect(Collectors.toList());
//                    
//                    collisions.stream().forEach(collided -> {
//                        asteroids.remove(collided);
//                        gameLayout.getChildren().remove(collided.getCharacter());
//                });   
//            });
//                
//             List <Projectile> projectilesToRemove = projectiles.stream().filter(projectcile -> {
//                 List <Asteroid> collisions = asteroids.stream()
//                         .filter(asteroid -> asteroid.collide(projectcile))
//                         .collect(Collectors.toList());
//                 
//                 if(collisions.isEmpty()) {
//                     return false;
//                 }
//                 
//                 collisions.stream().forEach(collided -> {
//                     asteroids.remove(collided);
//                     gameLayout.getChildren().remove(collided.getCharacter());
//                 });
//                 return true;
//                 
//             }).collect(Collectors.toList());
//             
//             projectilesToRemove.forEach(projectile -> {
//                 gameLayout.getChildren().remove(projectile.getCharacter());
//                 projectiles.remove(projectile);
//             });