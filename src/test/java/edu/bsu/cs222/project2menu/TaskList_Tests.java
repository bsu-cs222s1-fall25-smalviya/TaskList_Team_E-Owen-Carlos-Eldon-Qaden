package edu.bsu.cs222.project2menu;

import javafx.application.Application;
import javafx.scene.Scene;
import org.junit.jupiter.api.Test;

public class TaskList_Tests {

    @Test
    public void launchTest(){
        Application.launch(String.valueOf(Launcher.class));
        launchTest();
    }

    @Test
    public void photoTest(){
        Photo photo = new Photo();
        photo.saveScreenshot();
        photoTest();
    }

    @Test
    public void applicationTest(){
        TaskApplication application = new TaskApplication();
        application.getClass();
        applicationTest();
    }

}
