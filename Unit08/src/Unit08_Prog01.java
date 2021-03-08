import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Unit08_Prog01 extends Application {

    public static void main(String[] args) { //the application is started from here
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        /******
         Set up
        ******/
        primaryStage.setTitle("Unit08_Prog01"); //The stage is set!

        VBox rootNode = new VBox();
            HBox pane1 = new HBox(); //The first one is created as a HBox.
            pane1.setSpacing(10);
            pane1.setAlignment(Pos.CENTER);
             Pane pane2 = new Pane(); //The second one is created as a Pane.
            HBox pane3 = new HBox(); //The third one is created as a HBox.
            pane3.setSpacing(10);
            pane3.setAlignment(Pos.CENTER);
             rootNode.getChildren().addAll(pane1,pane2,pane3);

        primaryStage.setScene(new Scene(rootNode, 480, 225)); //The root node is set up


        /***********
         Second pane
         ***********/
        TextArea textArea = new TextArea();
        textArea.setText("Programming is fun!");
        pane2.getChildren().add(textArea);
        textArea.setEditable(false);


        /********
         First pane
         ********/
        ToggleGroup groupColor = new ToggleGroup();
        //the radio button objects are created
        RadioButton red = new RadioButton();
        RadioButton yellow = new RadioButton();
        RadioButton white = new RadioButton();
        RadioButton orange = new RadioButton();
        RadioButton green = new RadioButton();
        //toggle groups set
        red.setToggleGroup(groupColor);
        yellow.setToggleGroup(groupColor);
        white.setToggleGroup(groupColor);
        orange.setToggleGroup(groupColor);
        green.setToggleGroup(groupColor);

        //the radio buttons' texts come next, as well as setting up yellow to be the first selected radio button
        red.setText("Red");
        yellow.setText("Yellow");
        white.setText("White");
        white.setSelected(true);
        white.requestFocus();
        orange.setText("Orange");
        green.setText("Green");

        //The buttons are added
        pane1.getChildren().add(red);
        pane1.getChildren().add(yellow);
        pane1.getChildren().add(white);
        pane1.getChildren().add(orange);
        pane1.getChildren().add(green);

        //These are the event handlers to toggle everything
        red.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Region background = (Region) textArea.lookup(".content");
                background.setStyle ("-fx-background-color: red");
            }
        });
        yellow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Region background = (Region) textArea.lookup(".content");
                background.setStyle ("-fx-background-color: yellow");
            }
        });
        white.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Region background = (Region) textArea.lookup(".content");
                background.setStyle ("-fx-background-color: white");
            }
        });
        orange.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Region background = (Region) textArea.lookup(".content");
                background.setStyle ("-fx-background-color: orange");
            }
        });
        green.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Region background = (Region) textArea.lookup(".content");
                background.setStyle ("-fx-background-color: green");
            }
        });


        /**********
         Third pane
         **********/
        Group groupDirections = new Group();
        Button left = new Button();
        left.setText("<=");
        Button right = new Button();
        right.setText("=>");

        //The buttons are added
        pane3.getChildren().add(left);
        pane3.getChildren().add(right);

        left.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
            }
        });
        right.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
            }
        });


        primaryStage.show(); //Finally, the scenes and stages are shown
    }
}
