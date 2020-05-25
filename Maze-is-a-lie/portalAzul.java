import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class portalAzul extends Actor
{

    /**
     * Act - do whatever the portalAzul wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Chell.class)){
        Maze1.theme.stop();
        Greenfoot.setWorld( new  Maze2());
        }
    }
}
