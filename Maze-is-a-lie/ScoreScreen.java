import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreScreen extends World
{
    private GreenfootSound theme =  new  GreenfootSound("CaraMia8bit.mp3");
    /**
     * Constructor for objects of class ScoreScreen.
     * 
     */
    public ScoreScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
       
    }
    public void act(){
    theme.play();
    }
}
