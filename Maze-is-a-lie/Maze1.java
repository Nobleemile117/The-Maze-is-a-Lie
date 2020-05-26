
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
<<<<<<< HEAD
    public static GreenfootSound theme =  new  GreenfootSound("copiedCityNier.mp3");
    private Chell chell =  new  Chell();
    private portalAzul portal =  new  portalAzul();
    private int direccion;
    private Stopwatch uhr = new Stopwatch();
    private static int timer = 0;
    private static int timer2 =0;
=======
    private Chell chell =  new  Chell();
    private PortalAzul portal =  new  PortalAzul();
    private int direccion;
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29

    /**
     * Constructor for objects of class Maze1.
     * 
     */
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(770, 630, 1);
<<<<<<< HEAD
        createMaze();
        addObject(chell, 385, 315);
        addObject(uhr, 50, 50);
=======
        Stopwatch.getInstance().reset();
        createMaze();
        addObject(chell, 385, 315);
        addObject(Stopwatch.getInstance(), 50, 50);
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
        addObject(portal, 300, 500);
    }

    public void act(){
        //createMaze();
<<<<<<< HEAD
        theme.play();
        timer++;
        if(timer==60){
            timer2++;
            timer=0;
        }
        uhr.updateStopwatch(timer2);

    }

=======
        CopiedCity.getInstance().playTheme();
        Stopwatch.getInstance().start();
    }
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
    public void createMaze()
    {   

        int punterox=0;
        int punteroy=0;

        try(FileReader fileReader = new FileReader("Maze1.txt"))
<<<<<<< HEAD
        {
            char[] ayuda = new char[1];
            
            int caracterLeido = fileReader.read(ayuda);
            while(caracterLeido != -1){
                switch(ayuda[0]){
                    case '1':
                    addObject(new Bloque(),punterox,punteroy);
=======
        {   
            char[] ejemplo = new char[1];
            
            int caracterLeido = fileReader.read(ejemplo);
            while(caracterLeido != -1){
                switch(ejemplo[0]){ 
                    case '1':
                    addObject(new esquinasuperiorIzquierda(),punterox,punteroy);
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
                    punterox+=35;
                    break;

                    case '2':
<<<<<<< HEAD
=======
                    addObject(new paredHorizontalSuperior(),punterox,punteroy);
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
                    punterox+=35;
                    break;

                    case '3':
<<<<<<< HEAD
                    addObject(new Bloque(),punterox,punteroy);
=======
                    addObject(new esquinasuperiorderecha(),punterox,punteroy);
                    punterox=0;
                    punteroy+=35;
                    break;
                    case '4':
                    addObject(new esquinasuperiorderecha(),punterox,punteroy);
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
                    punterox=0;
                    punteroy+=35;
                    break;
                }
<<<<<<< HEAD
                caracterLeido = fileReader.read(ayuda);
            }
            fileReader.close();
=======
                caracterLeido = fileReader.read(ejemplo);
            }
            
>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
        }catch(IOException ex){
            System.err.println("Error al leer el archivo");
            ex.printStackTrace();
        }

<<<<<<< HEAD
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
   
=======
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

>>>>>>> bd17b807830610b58faa498342fd42d7e85d8a29
