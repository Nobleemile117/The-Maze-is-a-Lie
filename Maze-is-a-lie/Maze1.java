
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
    private PortalAzul portal =  new  PortalAzul();
    private int direccion;
    private boolean exe;
    
    /**
     * Constructor for objects of class Maze1.
     * 
     */
    public Maze1(int x,int y)
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(770, 630, 1);
        createMaze(x,y);
        Stopwatch.getInstance().reset();
        addObject(Stopwatch.getInstance(), 50, 50);
        exe = true;
        //Stopwatch.getInstance().start();
    }

    public void act(){
        //createMaze();
        CopiedCity.getInstance().playTheme();
        Stopwatch.getInstance().start();

        }

    public void createMaze(int x,int y)
    {   
        
        try(FileReader fileReader = new FileReader("Maze1.txt"))
        {
            char[] ayuda = new char[1];
            int punterox = 0;
            int punteroy = 0;
            
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
                    
                    case '5':
                    addObject(new PortalAzul(),punterox,punteroy);
                    punterox+=35;
                    break;

                }
                caracterLeido = fileReader.read(ayuda);
                addObject(new Chell(),x,y);
            }
        }catch(IOException ex){
            System.err.println("Error al leer el archivo");
            ex.printStackTrace();
        }
    }
    
    public void setExe(){
        exe = false;
    }
    
    public boolean getExe(){
        return exe;
    }
}
