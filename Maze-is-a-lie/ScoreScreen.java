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
    /**
     * Constructor for objects of class ScoreScreen.
     * 
     */
    public ScoreScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);
        
        
       
    }
    public void act(){
    theme.play();
    }/*
    public void DrawHighScore(){
    GreenfootImage img = new GreenfootImage(50, 20);
        img.setColor(Color.BLACK);
        img.setFont(new Font("Calibri", 20));
        img.drawString("Top time: "+ highScore, 5, 18);
        setImage(img);
    }
    public String GetHighScoreValue(){
        FileReader readfile = null;
        BufferedReader reader = null;
        try{
         readfile = new FileReader("leaderboard.txt");
         reader = new BufferedReader(readfile);
         return reader.readLine();
        }
        catch(Exception e){
            return"0";
        }
        finally{
            try{
                reader.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }*/
    public void compareScores(){
        if(Stopwatch.getInstance().getTime()<TopTime.getInstance().getTopTime()){
         String name =JOptionPane.showInputDialog("You set a new. Cual es tu nombre?");
         
        }
        }
}
