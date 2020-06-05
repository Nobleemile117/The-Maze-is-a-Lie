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
public class Records implements Comparable<Records>
{
    private String highScore = "NoBody:0";
    private int score;
    private String name;
    /**
     * Act - do whatever the TopTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Records(int score, String name) {
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

         return  (((Records)this).score == ((Records)obj).score)&&(((Records)this).name.equals(((Records)obj).name));
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
    public int compareTo(Records record) {
        if (score < record.score) {
            return -1;
        }
        if (score > record.score) {
            return 1;
        }
        return 0;
    }
    
    
 }
