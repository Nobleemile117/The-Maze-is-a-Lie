import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 * Write a description of class TopTime2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopTime2 extends Actor
{
    private String score = "NoBody:0";
    private static TopTime2 uniqueInstance;
    /**
     * Act - do whatever the TopTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(score.equals("NoBody:0")){
            score = this.GetHighScoreValue();
        }

    }

    public void setHighScore(){
        score = this.GetHighScoreValue();
    }

    public static TopTime2 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new TopTime2();
        }
        return uniqueInstance;
    }

    public void DrawHighScore(){
        score = this.GetHighScoreValue();
        GreenfootImage img = new GreenfootImage(400, 200);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Times New Roman", 25));
        img.drawString("2nd best time: " + score, 5, 30);
        setImage(img);
    }


    public String GetHighScoreValue(){

        try(FileReader readfile = new FileReader("leaderboard2.txt");

        BufferedReader reader = new BufferedReader(readfile)){
            return reader.readLine();
        }
        catch(Exception e){
            return"0";
        }

    }

    public int getTopTime(){
        return Integer.parseInt((score.split(":")[1]));
    }
    public String getName(){
        
        return (score.split(":")[0]);
    }
    public void setTopTime(String name, int score){
        this.score = name + ":" + score;
        File scoreFile = new File ("leaderboard2.txt");
        try(FileWriter writerFile = new FileWriter(scoreFile);
        BufferedWriter writer = new BufferedWriter(writerFile)){
            writer.write(this.score);
        }
        catch(Exception e){}

    }    
}
