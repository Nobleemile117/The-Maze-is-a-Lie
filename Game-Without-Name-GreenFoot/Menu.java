// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Menu extends World
{
    private int opcion = 0;
    private GreenfootSound theme =  new  GreenfootSound("menuTheme.mp3");
    
    private Puntero puntero =  new  Puntero();

    /**
     * Constructor for objects of class Menu.
     */
    public Menu()
    {
        super(800, 600, 1);
        preparamundo();
    }

    /**
     * 
     */
    private void preparamundo()
    {
        addObject( new  Jugar(), 400, 150);
        
        addObject( new  Salir(), 400, 350);
        
        addObject(puntero, 165, 150);
    }

    /**
     * 
     */
    public void act()
    {
        theme.play();
        
        if (Greenfoot.isKeyDown("UP") && opcion != 0) {
            opcion = opcion + 1;
        }
        
        if (Greenfoot.isKeyDown("Down") && opcion != 1) {
            opcion = opcion - 1;
        }
        
        if (opcion >= 2) {
            opcion = 0;
        }
        
        if (opcion < 0) {
            opcion = 1;
        }
        
        puntero.setLocation(165, 150 + (opcion * 200));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")) {
            switch (opcion) {
                case 1 : {
                    Greenfoot.stop();
                    
                    break;
                }
                case 0 : {
                    Greenfoot.setWorld( new  MyWorld());
                    
                    break;
                }
            }
        }
    }
}
