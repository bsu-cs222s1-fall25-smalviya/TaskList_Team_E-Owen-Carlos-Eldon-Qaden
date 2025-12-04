package edu.bsu.cs222.project2menu;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TaskListController implements Initializable {
    @FXML private Label welcomeText;
    @FXML private TextField taskInputField;
    @FXML private DatePicker dateInputField;
    @FXML private ListView<Task> formatedListArea;

    Format format = new Format();

    ArrayList<Task> tasklist = new ArrayList<>();

    public String[] dateParse;



    Photo photo = new Photo();
    private FXCollections FXCollection;

    //gives each dropdown menu their choices
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

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
        String name = taskInputField.getText();
        LocalDate date = dateInputField.getValue();
        dateParse = date.toString().split("-");
        int year = Integer.parseInt(dateParse[0]);
        int month = Integer.parseInt(dateParse[1]);
        int day = Integer.parseInt(dateParse[2]);

        Task Task = new Task(year,day,month,name);

        tasklist.add(Task);

        welcomeText.setText("Entered task: " + name + " and date: " + year + "-" + month + "-" + day);

        format.formatTaskList(tasklist);

        formatedListArea.getItems().clear();

        for (int i = 0; i < tasklist.size(); i++){
            formatedListArea.getItems().add(tasklist.get(i));
        }
    }

    //clears list and any info related to the list to begin making a new one
    @FXML protected void clearList() {
        welcomeText.setText("List was cleared!");
        taskInputField.clear();
        dateInputField.setValue(null);
        formatedListArea.getItems().clear();
        tasklist.clear();
    }

}
