import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Leaderboards extends World
{
    private GreenfootSound theme =  new  GreenfootSound("Never Forget.mp3");
    private returnButton Button =  new  returnButton();
    /**
     * Constructor for objects of class ScoreScreen.
     * 
     */
    public Leaderboards()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 550, 1); 
        addObject(TopTime.getInstance(), 210, 300);
        addObject(Button, 650, 100);
    }

    public void act(){
        theme.play();
        TopTime.getInstance().DrawHighScore();
        if(Greenfoot.mouseClicked(Button)){
            theme.stop();
            Greenfoot.setWorld( new  Menu());
        }
    }
}
