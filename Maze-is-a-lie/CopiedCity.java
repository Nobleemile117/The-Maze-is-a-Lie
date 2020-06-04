import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopiedCity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopiedCity extends Music
{
    private static CopiedCity uniqueInstance;
    private  GreenfootSound theme =  new  GreenfootSound("copiedCityNier.mp3");
    /**
     * Act - do whatever the CopiedCity wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }
    public static CopiedCity getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new CopiedCity();
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
