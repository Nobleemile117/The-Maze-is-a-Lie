import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PortalAzul2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalAzul2 extends Actor
{
       /**
     * Act - do whatever the PortalAzul2 wants to do. This method is called whenever
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
