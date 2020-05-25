import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class portalRojo extends Actor
{

    /**
     * Act - do whatever the portalRojo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Chell.class)) {
            Greenfoot.setWorld( new ScoreScreen());
             Maze2.theme.stop();
            Greenfoot.setWorld( new  ScoreScreen());
        }
    }
        }