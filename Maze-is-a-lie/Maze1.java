
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
    private Chell chell =  new  Chell();
    private PortalAzul portal =  new  PortalAzul();
    private int direccion;

    /**
     * Constructor for objects of class Maze1.
     * 
     */
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(770, 630, 1);
        Stopwatch.getInstance().reset();
        createMaze();
        addObject(chell, 385, 315);
        addObject(Stopwatch.getInstance(), 50, 50);
        addObject(portal, 300, 500);
    }

    public void act(){
        //createMaze();
        CopiedCity.getInstance().playTheme();
        Stopwatch.getInstance().start();
    }
    public void createMaze()
    {   

        int punterox=0;
        int punteroy=0;

        try(FileReader fileReader = new FileReader("Maze1.txt"))
        {   
            char[] ejemplo = new char[1];
            
            int caracterLeido = fileReader.read(ejemplo);
            while(caracterLeido != -1){
                switch(ejemplo[0]){ 
                    case '1':
                    addObject(new esquinasuperiorIzquierda(),punterox,punteroy);
                    punterox+=35;
                    break;

                    case '2':
                    addObject(new paredHorizontalSuperior(),punterox,punteroy);
                    punterox+=35;
                    break;

                    case '3':
                    addObject(new esquinasuperiorderecha(),punterox,punteroy);
                    punterox=0;
                    punteroy+=35;
                    break;
                    case '4':
                    addObject(new esquinasuperiorderecha(),punterox,punteroy);
                    punterox=0;
                    punteroy+=35;
                    break;
                }
                caracterLeido = fileReader.read(ejemplo);
            }
            
        }catch(IOException ex){
            System.err.println("Error al leer el archivo");
            ex.printStackTrace();
        }

    }

    /*public void createMaze(){
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

    }*/

}

