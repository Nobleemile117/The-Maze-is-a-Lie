import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.io.*;

/**
 * 
 */
public class Maze3 extends World
{
    /**
     * Constructor for objects of class Maze2.
     */
    public Maze3(int x,int y)
    {
        super(770, 630, 1);
        addObject(Stopwatch.getInstance(), 50, 50);
    }

    public void act(){
        Gwyn.getInstance().playTheme();
        Stopwatch.getInstance().start();
    }

}
