package edu.bsu.cs222.project2menu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.Format;
import java.util.ResourceBundle;

public class TaskListController implements Initializable {
    @FXML private Label welcomeText;
    @FXML private TextField taskInputField;
    @FXML private ChoiceBox<String> dayChoiceBox;
    @FXML private ChoiceBox<String> hourChoiceBox;
    @FXML private ChoiceBox<String> minuteChoiceBox;

    private final String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private final String [] hours = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private final String [] minutes = {"5","10","15","20","25","30","35","40","45","50","55"};

    Photo photo = new Photo();

    //gives each dropdown menu their choices
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dayChoiceBox.getItems().addAll(days);
        hourChoiceBox.getItems().addAll(hours);
        minuteChoiceBox.getItems().addAll(minutes);
    }
    //takes a screenshot of the users screen to keep a version of their list
    @FXML protected void listScreenshot() {
        welcomeText.setText("Take a screenshot!");
        photo.saveScreenshot();
        boolean success = photo.saveScreenshot();
        if (success) {
            welcomeText.setText("Screenshot saved!");
        }else {welcomeText.setText("Screenshot was not able to be saved!");}
    }

    //return input from formating code to print to list
    @FXML protected void printInput() {
        String task = taskInputField.getText();
        welcomeText.setText("Entered task: " + task);
    }
    //clears list and any info related to the list to begin making a new one
    @FXML protected void clearList() {
        welcomeText.setText("List was cleared!");
        taskInputField.clear();
        dayChoiceBox.setValue(null);
        hourChoiceBox.setValue(null);
        minuteChoiceBox.setValue(null);
    }

}
