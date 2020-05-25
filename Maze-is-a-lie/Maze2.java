import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Maze2 extends World
{
     public static GreenfootSound theme =  new  GreenfootSound("WantYouGone8bit.mp3");
     private int timer = Maze1.getTimer();
     private int timer2 = Maze1.getTimer2();
     private Stopwatch uhr2 = new Stopwatch();
     private Chell chell = new Chell();
    /**
     * Constructor for objects of class Maze2.
     */
    public Maze2()
    {
        super(770, 630, 1);
        addObject(chell,385,315);
        addObject(uhr2, 50, 50);
    }
    public void act(){
    theme.play();
    timer++;
            if(timer==60){
                timer2++;
                timer=0;
            }
            uhr2.updateStopwatch(timer2);
    }
    public  int getTimer(){
        return timer;
        }
       public  int getTimer2(){
        return timer2; 
        }
}
