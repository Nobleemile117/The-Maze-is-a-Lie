import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PortalAzul22 extends Actor
{

    /**
     * Act - do whatever the PortalAzul22 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {if(isTouching(Chell.class)){
            Greenfoot.setWorld( new Maze3v2());
        }
    }
}
