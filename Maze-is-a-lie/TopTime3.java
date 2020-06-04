import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Write a description of class TopTime3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopTime3 extends Actor
{
    private String highScore = "NoBody:0";
    private static TopTime3 uniqueInstance;
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

    public static TopTime3 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new TopTime3();
        }
        return uniqueInstance;
    }

    public void DrawHighScore(){
        highScore = this.GetHighScoreValue();
        GreenfootImage img = new GreenfootImage(400, 200);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Times New Roman", 25));
        img.drawString("3rd best time: " + highScore, 5, 30);
        setImage(img);
    }

    public String GetHighScoreValue(){

        try(FileReader readfile = new FileReader("leaderboard3.txt");

        BufferedReader reader = new BufferedReader(readfile)){
            return reader.readLine();
        }
        catch(Exception e){
            return"0";
        }

    }

    public int getTopTime(){
        return Integer.parseInt((highScore.split(":")[1]));
    }

    public void setTopTime(String name, int score){
        this.highScore = name + ":" + score;
        File scoreFile = new File ("leaderboard3.txt");
        try(FileWriter writerFile = new FileWriter(scoreFile);
        BufferedWriter writer = new BufferedWriter(writerFile)){
            writer.write(this.highScore);
        }
        catch(Exception e){}

    }    
}
