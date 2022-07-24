package myproject.GUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import myproject.data.Skater;

import java.util.ArrayList;

public class SkaterGUI {
    private BorderPane pane;
    private Label nameL;
    private Label genderL;
    private Label ageCategoryL;
    private Label nationL;
    private Label clubL;
    private Label graphsL;
    private Button graphsB1;
    private Button graphsB2;
    private Label resultsL;
    private ArrayList<Button> resultsB;

    private HBox graphsBox;
    private HBox resultsBox;
    private VBox topBox;

    public SkaterGUI(Skater skater){
        pane = new BorderPane();
        nameL = new Label("Name:\t"+skater.getName()+" "+skater.getSurname());
        genderL = new Label("Gender:\t"+skater.getGender());
        switch (skater.getCategory()){
            case 'A': ageCategoryL = new Label("Age Category:\tJunior A (2021/2022)"); break;
            case 'B' : ageCategoryL = new Label("Age Category:\tJunior B (2021/2022)"); break;
            case 'C' : ageCategoryL = new Label("Age Category:\tJunior C (2021/2022)"); break;
            case 'D' : ageCategoryL = new Label("Age Category:\tJunior D (2021/2022)"); break;
            case 'E' : ageCategoryL = new Label("Age Category:\tJunior E (2021/2022)"); break;
            case 'F' : ageCategoryL = new Label("Age Category:\tJunior F (2021/2022)"); break;
            case 'S' : ageCategoryL = new Label("Age Category:\tSenior (2021/2022)"); break;
            case 'M' : ageCategoryL = new Label("Age Category:\tMaster (2021/2022)"); break;
            case 'P' : ageCategoryL = new Label("Age Category:\tLittle Shard (2021/2022)"); break;
            default: ageCategoryL = new Label("Age Category:\t ERROR"); break;
        }
        nationL = new Label("Home Country:\t"+skater.getNation());
        clubL = new Label("Club:\t"+skater.getClub());
        graphsL = new Label("Graphs:\t");
        graphsB1 = new Button("2021/2022 |");
        graphsB2 = new Button(" Last 4 years");
        graphsBox = new HBox(graphsL,graphsB1,graphsB2);
        graphsBox.setAlignment(Pos.CENTER);
        resultsL = new Label("Results:\t");
        resultsBox = new HBox(resultsL);
        resultsBox.setAlignment(Pos.CENTER);
        {//TODO create button list and add them to the box
        }
        topBox = new VBox(5,nameL,genderL,ageCategoryL,nationL,clubL,graphsBox,resultsBox);
        topBox.setAlignment(Pos.CENTER);

        pane.setTop(topBox);
    }

    public BorderPane getPane() {
        return pane;
    }
    public void setPane(BorderPane pane) {
        this.pane = pane;
    }
}
