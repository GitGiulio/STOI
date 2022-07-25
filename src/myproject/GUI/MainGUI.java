package myproject.GUI;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.TextAlignment;
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
    ImageView leftTopBanner;
    ImageView leftBotBanner;


    HBox topTopBox;

    VBox centerBox;
    VBox leftBox;
    VBox rightBox;

    HBox pane;
    @Override
    public void start(Stage stage) throws Exception {
        pane = new HBox();
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

        centerBox = new VBox(20,topTopBox,topBotBox);

        Label eventsL = new Label("Events");
        eventsL.setStyle("-Fx-background-color: #ffffff;");
        leftTopBanner = new ImageView("C:\\Users\\giuli\\IdeaProjects\\ShortTrackOnlineInfo\\src\\myproject\\files\\leftTopBannerSTOI.jpg");
        leftTopBanner.setOnMouseClicked(e -> {
            System.out.println("ciao frocio mona :;))"); //TODO
        });
        HBox leftTopBannerBox = new HBox(leftTopBanner);
        HBox eventsLBox = new HBox(eventsL);
        eventsL.setPrefWidth(120);
        eventsL.setTextAlignment(TextAlignment.CENTER);
        leftBotBanner = new ImageView("C:\\Users\\giuli\\IdeaProjects\\ShortTrackOnlineInfo\\src\\myproject\\files\\LeftBotBannerSTOI.jpg");
        leftBotBanner.setOnMouseClicked(e -> {
            System.out.println("ciao frocio mona :;))"); //TODO
        });
        HBox leftBotBannerBox = new HBox(leftBotBanner);
        leftBox = new VBox(eventsLBox,leftTopBannerBox,leftBotBannerBox);
        eventsLBox.setAlignment(Pos.TOP_RIGHT);
        eventsLBox.setPadding(new Insets(10,10,0,0));
        leftTopBannerBox.setAlignment(Pos.TOP_RIGHT);
        leftTopBannerBox.setPadding(new Insets(10,10,10,0));
        leftBotBannerBox.setAlignment(Pos.TOP_RIGHT);
        leftBotBannerBox.setPadding(new Insets(0,10,10,0));
        leftBox.setPrefWidth(scene.getWidth()/3);
        leftBox.setStyle("-Fx-background-color: #000067;");

        rightBox = new VBox();
        rightBox.setPrefWidth(scene.getWidth()/3);
        rightBox.setBackground(new Background(new BackgroundFill(Paint.valueOf("#000067"),new CornerRadii(0),new Insets(0))));

        pane.getChildren().addAll(leftBox, centerBox,rightBox);
        stage.setTitle("ShorttrackOnLine.info");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}