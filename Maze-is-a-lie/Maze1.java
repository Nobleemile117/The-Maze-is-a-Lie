import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze1 extends World
{
    private GreenfootSound theme2 =  new  GreenfootSound("copiedCityNier.mp3");
    private Chell chell =  new  Chell();
    private int direccion;
private Stopwatch uhr = new Stopwatch();
private int timer = 0;
private int timer2 =0;
 
    /**
     * Constructor for objects of class Maze1.
     * 
     */
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        addObject(chell, 400, 400);
        addObject(uhr, 50, 50);
    }
    public void act(){
        timer++;
        theme2.play();
        if(timer==60){
        timer2++;
        timer=0;
        }
        uhr.updateStopwatch(timer2);

    
    }
}
   
