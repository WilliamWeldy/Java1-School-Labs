import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program uses the JavaFX library, creating a single 300x250 stage titled "Hello JavaFX!" and clicking the centered button to print the scene title to the console.
 * Due: 10/29/2019
 * @author William Weldy
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */

public class Unit07_Prog01 extends Application {

    public static void main(String[] args) { //the application is started from here
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX!"); //Setting the stage
        Button btn = new Button(); //The button object is created


        btn.setText("Say 'Hello JavaFX'"); //This sets the text on the button itself
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { //This method will print to the console
                System.out.println("Hello JavaFX");
            }
        });

        StackPane rootNode = new StackPane(); //Root node is created as a Stack Pane
        rootNode.getChildren().add(btn); //The button is added

        primaryStage.setScene(new Scene(rootNode, 300, 250)); ; //The scene is set
        primaryStage.show(); //Everything set up is now shown
    }
}
