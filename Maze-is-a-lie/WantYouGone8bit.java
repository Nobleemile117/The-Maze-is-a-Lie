import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WantYouGone8bit extends Actor
{
    private static WantYouGone8bit uniqueInstance;
    private  GreenfootSound theme =  new  GreenfootSound("WantYouGone8bit.mp3");
    /**
     * Act - do whatever the WantYouGone8bit wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    public static WantYouGone8bit getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new WantYouGone8bit();
        }
        return uniqueInstance;
    }
    public void playTheme(){
    theme.play();
    
    }
    public void stopTheme(){
    theme.stop();
    
    }
}
