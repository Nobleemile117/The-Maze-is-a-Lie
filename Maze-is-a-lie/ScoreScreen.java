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
        addObject(TopTime.getInstance(), 300, 200);
        addObject(salir, 600, 350);
        addObject(jugar, 600, 150);

    }

    public void act(){
        TopTime.getInstance().DrawScore();
        theme.play();
        compareScores();
    }

    public void compareScores(){
        TopTime.getInstance().setHighScore();
        if(TopTime.getInstance().getTopTime() == 0){
            String name =JOptionPane.showInputDialog("You set a new. Cual es tu nombre?");
            TopTime.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
        }
        if(Stopwatch.getInstance().getTime()<TopTime.getInstance().getTopTime()){
            String name =JOptionPane.showInputDialog("You set a new. Cual es tu nombre?");
            TopTime.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
        }
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
