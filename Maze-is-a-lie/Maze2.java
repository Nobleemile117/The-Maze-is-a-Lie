import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.io.*;

/**
 * 
 */
public class Maze2 extends World
{
    private Chell chell = new Chell();
    private boolean exe;

    /**
     * Constructor for objects of class Maze2.
     */
    public Maze2(int x,int y)
    {
        super(770, 630, 1);
        createMaze2(x,y);
        addObject(Stopwatch.getInstance(), 50, 50);
    }

    public void act(){
        WantYouGone8bit.getInstance().playTheme();
        Stopwatch.getInstance().start();
    }
    
    public void createMaze2(int x,int y)
    {   

        int punterox=0;
        int punteroy=0;

        try(FileReader fileReader = new FileReader("Maze2.txt"))
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
                    
                    case '4':
                    addObject(new Chell(), punterox, punteroy); 
                    punterox+=35;
                    break;
                    
                    case '5':
                    addObject(new PortalRojo2(),punterox,punteroy);
                    punterox+=35;
                    break;

                }
                caracterLeido = fileReader.read(ayuda);
            }
        }catch(IOException ex){
            System.err.println("Error al leer el archivo");
            ex.printStackTrace();
        }
    }
}
