import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * Write a description of class TopTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopTime extends Actor
{
     private String highScore = "";
     private static TopTime uniqueInstance;
    /**
     * Act - do whatever the TopTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(highScore.equals("")){
        highScore = this.GetHighScoreValue();
        }
       
    }
    public static TopTime getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new TopTime();
        }
        return uniqueInstance;
    }
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
    }
    public int getTopTime(){
    return Integer.parseInt((highScore.split(":")[1]));
    }
    public void setTopTime(String name, int score){
        this.highScore = name + ":" + score;
    }
    }    

