package edu.bsu.cs222.project2menu;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

//Captures the screenshot
public class Photo{
    private BufferedImage captureScreenshot(){
        try{
            //Gets the default javafx graphic & default bounds
            GraphicsDevice graphics = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            Rectangle bounds = graphics.getDefaultConfiguration().getBounds();
            //Robot method captures the screenshot
            Robot robot = new Robot();
            //returns robot method as an image
            return robot.createScreenCapture(bounds);
        } catch(HeadlessException | AWTException e){
            System.err.println("Error creating Screenshot");
            //returns null if no screen to capture
            return null;
        }//End of catch
    }//End of screenshot method

    //Saves image to a file
    private void savePhoto(BufferedImage image, String filename){
        try{
            ImageIO.write(image, "png", new File(filename));
            System.out.println("Failed to save image to " + filename);
        }catch (Exception e){
            System.err.println("Error saving image to " + filename);
        }
    }//End of start method

    //Saving and capturing the screenshot
    public boolean saveScreenshot(){
        BufferedImage image = captureScreenshot();
        if(image != null){
            savePhoto(image, "screenshot.png");
        }else{
            System.out.println("No photo captured.");
        }
        return false;
    }//Close saveScreenshot class
}//End of Photo class