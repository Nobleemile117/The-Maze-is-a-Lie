import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
/**
 * Write a description of class ScoreScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreScreen extends World
{
    private GreenfootSound theme =  new  GreenfootSound("CaraMia8bit.mp3");
    private String name;
    private Salir salir =  new  Salir();
    private Jugar jugar =  new  Jugar();
    /**
     * Constructor for objects of class ScoreScreen.
     * 
     */
    public ScoreScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        addObject(salir, 600, 350);
        addObject(jugar, 600, 150);
        String name =JOptionPane.showInputDialog("Tell me What is your name? \n You can see on leaderboards if you are in the Top 10");
        Records records =  new  Records(Stopwatch.getInstance().getTime() , name);
        GameRecord.save(records);
        
    }

    public void act(){
        showText(String.valueOf(Stopwatch.getInstance().getTime()),300,200 ); 
        theme.play();
        buttons();
    }

    public void buttons(){
        if(Greenfoot.mouseClicked(salir)){
            theme.stop();
            Greenfoot.stop();
        }
        if(Greenfoot.mouseClicked(jugar)){
            theme.stop();
            Greenfoot.setWorld( new  Menu());
        }
    }
}
