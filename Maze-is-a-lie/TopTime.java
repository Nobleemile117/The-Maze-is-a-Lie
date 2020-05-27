import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
/**
 * Write a description of class TopTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopTime extends Actor
{
     private String highScore = "NoBody:0";
     private static TopTime uniqueInstance;
    /**
     * Act - do whatever the TopTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(highScore.equals("NoBody:0")){
        highScore = this.GetHighScoreValue();
        }
       
    }
    public void setHighScore(){
        highScore = this.GetHighScoreValue();
    }
    public static TopTime getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new TopTime();
        }
        return uniqueInstance;
    }
    public void DrawHighScore(){
        highScore = this.GetHighScoreValue();
    GreenfootImage img = new GreenfootImage(400, 200);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Times New Roman", 25));
        img.drawString("Top time: " + highScore, 5, 30);
        setImage(img);
    }
    public void DrawScore(){
    GreenfootImage img = new GreenfootImage(400, 200);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Calibri", 20));
        img.drawString("Your Time: " + Stopwatch.getInstance().getTime(), 5, 18);
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
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public int getTopTime(){
    return Integer.parseInt((highScore.split(":")[1]));
    }
    public void setTopTime(String name, int score){
        this.highScore = name + ":" + score;
        File scoreFile = new File ("leaderboard.txt");
        if(!scoreFile.exists()){
            try{
                scoreFile.createNewFile();
            }   catch(Exception e){
                e.printStackTrace();
        }
        }
        FileWriter writerFile = null;
        BufferedWriter writer = null;
        try{
        writerFile = new FileWriter(scoreFile);
        writer = new BufferedWriter(writerFile);
        writer.write(this.highScore);
        }
        catch(Exception e){}
        finally{
            try{
                if(writer != null){
                writer.close();
                }
            }catch(Exception e){}
        
        }
        
    }    
}
