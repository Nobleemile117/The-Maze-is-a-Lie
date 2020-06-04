import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gwyn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gwyn extends Music
{
    private static Gwyn uniqueInstance;
    private  GreenfootSound theme =  new  GreenfootSound("Gwyn.mp3");
    /**
     * Act - do whatever the Gwyn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    public static Gwyn getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Gwyn();
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
