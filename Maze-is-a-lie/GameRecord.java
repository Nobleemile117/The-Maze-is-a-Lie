
import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
public class GameRecord extends Actor {
    private static final int  MAX_RECORDS  = 10;
    public static void saveDocument( List<Records> list)
    {
        int cont=0;
        final String NEXT_LINE = "\n";
        try ( FileWriter fw = new FileWriter("leaderboard.txt")){
            for (Records temp : list) {
                if(cont<MAX_RECORDS){
                    fw.append(temp.getScore()+":"+ temp.getPlayerName());
                    fw.append(NEXT_LINE);
                }
                cont++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save(Records record) {
        List<Records> listTemp=list();

        listTemp.add(record);
        Collections.sort(listTemp);      
        saveDocument(listTemp);

    }

    public static List<Records> list() {
        List<Records> listTemp= new ArrayList();
        String strCurrentLine;
        int cont=0;
        try(  
       
        BufferedReader objReader = new BufferedReader(new FileReader("leaderboard.txt")) ){
            
            while ((strCurrentLine = objReader.readLine()) != null){    
                 if(cont <MAX_RECORDS){
                 listTemp.add(new Records(Integer.parseInt((strCurrentLine.split(":")[0])), strCurrentLine.split(":")[1]));}
                 
                 cont++;
            }
              
        }catch(Exception e){

        }
        Collections.sort(listTemp); 
        return listTemp;
    }
    public static int getMaxLength(){
    return MAX_RECORDS;
    }

    
    
}