import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Maze2 extends World
{
    public static GreenfootSound theme =  new  GreenfootSound("WantYouGone8bit.mp3");
    
    private Chell chell = new Chell();
    /**
     * Constructor for objects of class Maze2.
     */
    public Maze2()
    {
        super(770, 630, 1);
        addObject(chell,385,315);
        addObject(Stopwatch.getInstance(), 50, 50);
    }

    public void act(){
        theme.play();
    }
}
