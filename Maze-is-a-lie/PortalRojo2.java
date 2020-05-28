import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PortalRojo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalRojo2 extends Actor
{
    /**
     * Act - do whatever the PortalRojo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Chell.class)){       
            Greenfoot.setWorld( new ScoreScreen());
             Gwyn.getInstance().stopTheme();
        }
    }    
}
