import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Leaderboards extends World
{
private GreenfootSound theme =  new  GreenfootSound("Never Forget.mp3");
    /**
     * Constructor for objects of class ScoreScreen.
     * 
     */
    public Leaderboards()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        
    }
    public void act(){
    theme.play();
    
    }
}
