import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Class: CIST 2371 Java Programming I
 * Semester: Fall 2019
 * Instructor: Jerry Mamo
 * Description: This program uses the JavaFX library, creating a 310x60 stage with 3 buttons that will print "Button X pressed!" where x will be the button number you pressed.
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

public class Unit07_Prog02 extends Application {

    public static void main(String[] args) { //the application is started from here
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Three Button Demo"); //Setting the stage
        Button btn1 = new Button(); //Button objects are created
        Button btn2 = new Button();
        Button btn3 = new Button();

        btn1.setText("Button 01"); //This sets the text on the buttons themselves
        btn2.setText("Button 02");
        btn3.setText("Button 03");

        /* These are the event handlers to print out the text.*/

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button 01 pressed!");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button 02 pressed!");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button 03 pressed!");
            }
        });

        HBox rootNode = new HBox(); //Root node is created as a HBox
        rootNode.setSpacing(10); //Spacing is set

        rootNode.getChildren().add(btn1); //The buttons are added
        rootNode.getChildren().add(btn2);
        rootNode.getChildren().add(btn3);

        primaryStage.setScene(new Scene(rootNode, 310, 60)); //The scene is generated
        primaryStage.show(); //Everything set up is now shown
    }
}
