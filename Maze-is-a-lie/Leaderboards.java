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
        addObject(TopTime2.getInstance(), 210, 350);
        addObject(TopTime3.getInstance(), 210, 400);
        addObject(Button, 650, 100);
    }

    public void act(){
        theme.play();
        TopTime.getInstance().DrawHighScore();
        TopTime2.getInstance().DrawHighScore();
        TopTime3.getInstance().DrawHighScore();
        if(Greenfoot.mouseClicked(Button)){
            theme.stop();
            Greenfoot.setWorld( new  Menu());
        }
    }
}
