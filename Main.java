package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.lang.String;
import javafx.scene.paint.Color;


public class Main extends Application implements EventHandler <ActionEvent> {
    Stage window;
    RadioButton yes, no;
    Button submit;
    ToggleGroup answer;
    VBox mainLayout;
    HBox activities;





    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Activites");

        //Vbox
        mainLayout = new VBox();
        mainLayout.setPrefHeight(300);
        mainLayout.setSpacing(20);
        mainLayout.setPadding(new Insets(15, 15, 15, 15));

        // Hbox
        activities = new HBox();
        activities.setPrefWidth(300);
        activities.setSpacing(20);
        activities.setPadding(new Insets(15, 15, 15, 15));
        // questions
        Label question = new Label("");

        answer = new ToggleGroup();
        yes = new RadioButton("yes");
        yes.setToggleGroup(answer);
        no = new RadioButton("No");
        no.setToggleGroup(answer);

        //submit
        submit = new Button("Submit");
        submit.setOnAction(this);

        // Gui elements
        activities.getChildren().addAll(yes, no);
        mainLayout.getChildren().addAll(question);
        mainLayout.getChildren().addAll(activities, submit);
        activities.setAlignment(Pos.CENTER);
        mainLayout.setAlignment(Pos.CENTER);

        // Show
        Scene main = new Scene(mainLayout, 995, 558, Color.BLUE);
        window.setScene(main);
        window.show();
        window = primaryStage;
        window.setTitle("Activites");


        //Vbox
        mainLayout = new VBox();
        mainLayout.setPrefHeight(600);
        mainLayout.setSpacing(50);
        mainLayout.setPadding(new Insets(30, 30, 30, 30));

        // Hbox
        activities = new HBox();
        activities.setPrefWidth(600);
        activities.setSpacing(50);
        activities.setPadding(new Insets(30, 30, 30, 30));
        // questions
        Label question2 = new Label("How is the weather outside?");

        answer = new ToggleGroup();
        yes = new RadioButton("It is raining outside");
        yes.setToggleGroup(answer);
        no = new RadioButton("It is sunny outside");
        no.setToggleGroup(answer);

        //submit
        submit = new Button("Enter");
        submit.setOnAction(this);

        // Gui elements
        activities.getChildren().addAll(yes, no);
        mainLayout.getChildren().addAll(question2);
        mainLayout.getChildren().addAll(activities, submit);
        activities.setAlignment(Pos.CENTER);
        mainLayout.setAlignment(Pos.CENTER);

        // Show
        Scene main2 = new Scene(mainLayout, 995, 558, Color.BEIGE);
        window.setScene(main2);
        window.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (yes.isSelected()) {
            alert.setTitle("It is raining outside.");
            alert.setContentText("Ok, Here are some indoor activities you can do today: play videos games at home, Board games with friends, cooking, Study/read through your notes.");
            alert.showAndWait();
        } else {
            alert.setTitle("It's not raining outside.");
            alert.setContentText("Ok, Here are some outdoor activities you can do today: go to the mall, go to the beach, go on a hike, go to the park.");
            alert.showAndWait();
        }
    }
}