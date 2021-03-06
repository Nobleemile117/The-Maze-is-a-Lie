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
public class TopTime 
{
    private String highScore = "NoBody:0";
    private int score;
    private String name;
    /**
     * Act - do whatever the TopTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TopTime(int score, String name) {
        this.name=name;
        this.score=score;
    }
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public String toString(){
        return score + "," + name;
    }
    @Override
    public boolean equals(Object obj) {

         return  (((TopTime)this).score == ((TopTime)obj).score)&&(((TopTime)this).name.equals(((TopTime)obj).name));
    }
    public void setPlayerName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getPlayerName() {
        return name;
    }
    public int compareTo(TopTime record) {
        if (score < record.score) {
            return 1;
        }
        if (score > record.score) {
            return -1;
        }
        return 0;
    }
 }
