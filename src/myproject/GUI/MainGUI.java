package myproject.GUI;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import myproject.data.Skater;

import java.util.Date;

public class MainGUI extends Application {

    Button home;
    Button news;
    Button competition;
    Button live;
    Button ranking;
    Button statistics;
    Button athletes;
    Button entry;
    Button service;
    Button links;
    Button webTv;
    HBox topBotBox;

    ImageView headerImage;
    HBox topTopBox;

    VBox topCenterBox;

    BorderPane pane;
    @Override
    public void start(Stage stage) throws Exception {
        pane = new BorderPane();
        Scene scene = new Scene(pane,1920,1080);

        home = new Button("home");
        news = new Button("news");
        competition = new Button("competition");
        live = new Button("live");
        ranking = new Button("ranking");
        statistics = new Button("statistics");
        athletes = new Button("athletes");
        athletes.setOnAction(e -> {
            Scene scene1 = new Scene(new SkaterGUI(new  Skater("Giulio","Lo Cigno","ITA", Skater.gender.MALE,new Date(),'S',"Sporting Club Pergine")).getPane(),1920,1080);
            stage.setScene(scene1);
        });
        entry = new Button("entry");
        service = new Button("service");
        links = new Button("links");
        webTv = new Button("webTv");
        topBotBox = new HBox(15,home,news,competition,live,ranking,statistics,athletes,entry,service,links,webTv);
        topBotBox.setAlignment(Pos.CENTER);

        headerImage = new ImageView("C:\\Users\\giuli\\IdeaProjects\\ShortTrackOnlineInfo\\src\\myproject\\files\\header.jpg");
        topTopBox = new HBox(headerImage);
        topTopBox.setAlignment(Pos.CENTER);

        topCenterBox = new VBox(20,topTopBox,topBotBox);

        pane.setTop(topCenterBox);
        stage.setTitle("ShorttrackOnLine.info");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
