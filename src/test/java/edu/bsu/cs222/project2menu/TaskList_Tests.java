package edu.bsu.cs222.project2menu;

import org.junit.jupiter.api.Test;

public class TaskList_Tests {
    //Test case for our Photo Class
    @Test
    public void test_TaskList_Test() {
        Photo photo = new Photo();
        photo.saveScreenshot();
    }
    //Test case for our Format class
    @Test
    public void test_TaskList_Test2() {
        Format format = new Format();
        format.getClass();
    }
    //Test case for our Launcher class
    @Test
    public void test_TaskList_Test3() {
        Launcher launcher = new Launcher();
        launcher.getClass();
    }
    //Test case for our TaskApplication class
    @Test
    public void test_TaskList_Test4() {
        TaskApplication application = new TaskApplication();
        application.getClass();
    }
    //Test case for our TaskListController class
    @Test
    public void test_TaskList_Test5() {
        TaskListController controller = new TaskListController();
        controller.getClass();
    }
}