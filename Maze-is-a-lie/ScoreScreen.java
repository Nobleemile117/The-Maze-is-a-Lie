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
        TopTime.getInstance().setHighScore();
        /*if(Stopwatch.getInstance().getTime()>TopTime.getInstance().getTopTime() && Stopwatch.getInstance().getTime()<TopTime2.getInstance().getTopTime() || TopTime.getInstance().getTopTime() != 0 && TopTime2.getInstance().getTopTime() == 0){
        String name =JOptionPane.showInputDialog("You got the 2nd best time tell me what is your name?");
        TopTime2.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
        }*/
        if(TopTime.getInstance().getTopTime() == 0){
            String name =JOptionPane.showInputDialog("You set a top time tell me what is your name?");
            TopTime.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
        }
        else{
            if(Stopwatch.getInstance().getTime()<TopTime.getInstance().getTopTime()){
                String name =JOptionPane.showInputDialog("You set a top time tell me what is your name?");
                TopTime3.getInstance().setTopTime(TopTime2.getInstance().getName(),TopTime2.getInstance().getTopTime() );
                TopTime2.getInstance().setTopTime(TopTime.getInstance().getName(),TopTime.getInstance().getTopTime() );
                TopTime.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
            }
            else{
                if(TopTime2.getInstance().getTopTime() == 0){
                    String name =JOptionPane.showInputDialog("You got the 2nd best time tell me what is your name?");
                    TopTime2.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
                }
                else{
                    if(Stopwatch.getInstance().getTime()>TopTime.getInstance().getTopTime() && Stopwatch.getInstance().getTime()<TopTime2.getInstance().getTopTime()){
                        String name =JOptionPane.showInputDialog("You got the 2nd best time tell me what is your name?");
                        TopTime3.getInstance().setTopTime(TopTime2.getInstance().getName(),TopTime2.getInstance().getTopTime() );
                        TopTime2.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
                    }
                    else{
                        if(TopTime3.getInstance().getTopTime() == 0){
                            String name =JOptionPane.showInputDialog("You got the 3rd best time tell me what is your name?");
                            TopTime3.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
                        }
                        else{
                            if(Stopwatch.getInstance().getTime()<TopTime2.getInstance().getTopTime() && Stopwatch.getInstance().getTime()<TopTime3.getInstance().getTopTime()){
                                String name =JOptionPane.showInputDialog("You got the 3rd best time tell me what is your name?");
                                TopTime.getInstance().setTopTime(name,Stopwatch.getInstance().getTime() );
                            }

                        }
                    }
                }
            }
        }   
    }

    public void act(){
        TopTime.getInstance().DrawScore();
        theme.play();
        compareScores();
    }

    public void compareScores(){
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
