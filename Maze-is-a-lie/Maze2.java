import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Maze2 extends World
{
    
    private portalRojo portal =  new  PortalRojo();
    private Chell chell = new Chell();
    /**
     * Constructor for objects of class Maze2.
     */
    public Maze2()
    {
        super(770, 630, 1);
        addObject(chell,385,315);
        addObject(Stopwatch.getInstance(), 50, 50);
        addObject(portal, 300, 500);
    }

    public void act(){
        WantYouGone8bit.getInstance().playTheme();
        Stopwatch.getInstance().start();
    }
}
