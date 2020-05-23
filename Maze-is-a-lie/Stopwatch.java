import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stopwatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stopwatch extends Actor
{
private int[] uhrzeit = {0, 0}; //Stunde + Minute
private int timer = 0;
    /**
     * Act - do whatever the Stopwatch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public Stopwatch(){
updateStopwatch(timer);
}
    
public void updateStopwatch(int timer) {
      String time= String.valueOf(timer);
     String min=uhrzeit[0]<10?"0"+uhrzeit[0]:""+uhrzeit[0], sec=uhrzeit[1]<10?"0"+uhrzeit[1]:""+uhrzeit[1];
        GreenfootImage img = new GreenfootImage(50, 20);
        img.setColor(Color.BLACK);
        img.setFont(new Font("Calibri", 20));
        img.drawString(time, 5, 18);
        setImage(img);
}
}  
