import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.io.*;

/**
 * 
 */
public class Chell extends Actor
{
    private Maze1 maze1 = new Maze1(50,50);
    private int direccion;
    public int x;
    public int y;
    /**
     * Act - do whatever the Chell wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
        if (Greenfoot.isKeyDown("UP")) {
            movement(0);
        }

        if (Greenfoot.isKeyDown("Down") ) {
            movement(1);
        }
        if (Greenfoot.isKeyDown("Left")) {
            movement(2);
        }

        if (Greenfoot.isKeyDown("Right") ) {
            movement(3);
        }
        
        if (Greenfoot.isKeyDown("s")) {
            x = getX();
            y = getY();
            EscribeFichero();
        }    
    }

    public void movement(int direccion){
        switch(direccion){
            case 0:
            setRotation(270);
            setLocation(getX(),getY()-4);
            if(isTouching(Bloque.class)){
                setLocation(getX(),getY()+4);}
            break;
            case 1:
            setRotation(90);
            setLocation(getX(),getY()+4);
            if(isTouching(Bloque.class)){
                setLocation(getX(),getY()-4);}
            break;
            case 2:
            setRotation(0);
            setLocation(getX()-4,getY());
            if(isTouching(Bloque.class)){
                setLocation(getX()+4,getY());}
            if(isTouching(Bloque.class)){
                setLocation(getX()+4,getY());}
            break;
            case 3:
            setRotation(0);
            setLocation(getX()+4,getY());
            if(isTouching(Bloque.class)){
                setLocation(getX()-4,getY());}
            if(isTouching(Bloque.class)){
                setLocation(getX()-4,getY());}
            break;
        }

    }
    
    public void EscribeFichero(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter("save.txt");
            pw = new PrintWriter(fichero);
            
            pw.println(x);
            pw.println(y);
            
            if(maze1.getExe() == true){
                pw.println("asd");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero)
                    fichero.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
