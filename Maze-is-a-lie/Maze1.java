
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
        private GreenfootSound theme2 =  new  GreenfootSound("copiedCityNier.mp3");
        private Chell chell =  new  Chell();
        private int direccion;
        private Stopwatch uhr = new Stopwatch();
        private int timer = 0;
        private int timer2 =0;
        
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
        }
        
        public void act(){
            //createMaze();
            theme2.play();
            timer++;
            if(timer==60){
                timer2++;
                timer=0;
            }
            uhr.updateStopwatch(timer2);
        }
        
        /*
        public void createMaze()
        {   
            
            int punterox=0;
            int punteroy=0;
            
            try(FileReader fileReader = new FileReader("Maze1.txt"))
            {
                    int caracterLeido = fileReader.read();
                    while(caracterLeido != -1){
                            switch(caracterLeido){
                            case 1:
                                addObject(new esquinasuperiorIzquierda(),punterox,punteroy);
                                punterox+=35;
                                break;
                            
                            case 2:
                                addObject(new paredHorizontalSuperior(),punterox,punteroy);
                                punterox+=35;
                                break;
                            
                            case 3:
                                addObject(new esquinasuperiorderecha(),punterox,punteroy);
                                punterox=0;
                                punteroy+=35;
                                break;
                        }
                        caracterLeido = fileReader.read();
                    }
                    fileReader.close();
                }catch(IOException ex){
                    System.err.println("Error al leer el archivo");
                    ex.printStackTrace();
                }
            
        }
        */
       
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
       
           
    }
    
   
