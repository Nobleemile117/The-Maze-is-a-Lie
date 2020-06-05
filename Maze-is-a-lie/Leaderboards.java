import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * 
 */

public class Leaderboards extends World
{
    private GreenfootSound theme =  new  GreenfootSound("Never Forget.mp3");
    private returnButton Button =  new  returnButton();
    int cont = 0;
    int cont2 = 1;
    /**
     * Constructor for objects of class ScoreScreen.
     * 
     */
    public Leaderboards()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 550, 1); 
        addObject(Button, 650, 100);
        printScores();
    }

    public void act(){
        theme.play();

        if(Greenfoot.mouseClicked(Button)){
            theme.stop();
            Greenfoot.setWorld( new  Menu());
        }
    }

    public void printScores(){
        List<Records> list=GameRecord.list();
        /*if(list == null ){
                        showText("NOBODY HAS OVERCOME IT BEFORE",200,200 + cont);
                    }*/
            for (Records temp : list) {    
                if(cont2 < GameRecord.getMaxLength()+1){
                    
                    showText("TOP "+cont2 +": "+temp.getScore()+":"+temp.getPlayerName(),150,200 + cont); 
                    cont = cont +30;}
                cont2++;
            }
    }
}