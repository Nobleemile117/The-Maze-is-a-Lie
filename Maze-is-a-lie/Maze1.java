
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class Maze1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 

public class Maze1 extends World
{
    public static GreenfootSound theme =  new  GreenfootSound("copiedCityNier.mp3");
    private Chell chell =  new  Chell();
    private portalAzul portal =  new  portalAzul();
    private int direccion;
    private Stopwatch uhr = new Stopwatch();
    private static int timer = 0;
    private static int timer2 =0;

    /**
     * Constructor for objects of class Maze1.
     * 
     */
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(770, 630, 1);
        createMaze();
        addObject(chell, 385, 315);
        addObject(uhr, 50, 50);
        addObject(portal, 300, 500);
    }

    public void act(){
        //createMaze();
        theme.play();
        timer++;
        if(timer==60){
            timer2++;
            timer=0;
        }
        uhr.updateStopwatch(timer2);

    }

    public void createMaze()
    {   

        int punterox=0;
        int punteroy=0;

        try(FileReader fileReader = new FileReader("Maze1.txt"))
        {
            char[] ayuda = new char[1];
            
            int caracterLeido = fileReader.read(ayuda);
            while(caracterLeido != -1){
                switch(ayuda[0]){
                    case '1':
                    addObject(new Bloque(),punterox,punteroy);
                    punterox+=35;
                    break;

                    case '2':
                    punterox+=35;
                    break;

                    case '3':
                    addObject(new Bloque(),punterox,punteroy);
                    punterox=0;
                    punteroy+=35;
                    break;
                }
                caracterLeido = fileReader.read(ayuda);
            }
            fileReader.close();
        }catch(IOException ex){
            System.err.println("Error al leer el archivo");
            ex.printStackTrace();
        }

    }

    /*
    public void createMaze(){
        int punterox=0;
        int punteroy=0;

        addObject(new esquinasuperiorIzquierda(),punterox,punteroy);
        punterox+=35;
        while(punterox<=735){
            addObject(new paredHorizontalSuperior(),punterox,punteroy);
            punterox+=35;
        }
        addObject(new esquinasuperiorderecha(),punterox,punteroy);
        punterox=0;
        punteroy=+35;
        addObject(new paredVerticalIzquierda(),punterox,punteroy);
        punterox+=35;

    }
    */

    public static int getTimer(){
        return timer;//da error en la 2 corrida
    }

    public static int getTimer2(){
        return timer2; //da error en la 2 corrida
    }
    

}
   
