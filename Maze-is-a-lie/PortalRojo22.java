import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PortalRojo22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalRojo22 extends Actor
{
    /**
     * Act - do whatever the PortalRojo22 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Chell.class)){
            Greenfoot.setWorld( new Maze3());
        }
    }    
}
