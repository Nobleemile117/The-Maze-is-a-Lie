import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PortalRojo extends Actor
{

    /**
     * Act - do whatever the portalRojo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Chell.class)) {
            Greenfoot.setWorld( new Maze3());
             WantYouGone8bit.getInstance().stopTheme();
        }
    }
        }