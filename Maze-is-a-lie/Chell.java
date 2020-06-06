 import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.io.*;

/**
 * 
 */
public class Chell extends Actor
{
    private int direccion;
    private int x;
    private int y;
    private int chellPos;
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
            
            switch(chellPos){
                case 1:
                pw.println(1);
                break;
                
                case 2:
                pw.println(2);
                break;
                
                case 3:
                pw.println(3);
                break;
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
    
    public int getterX(){
        return x;
    }
    
    public int getterY(){
        return y;
    }
    
    public void setchellPos(int chellPos){
        this.chellPos = chellPos;
    }
    
    public int getchellPos(){
        return chellPos;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
}
