import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Chell extends Actor
{
     private int direccion;
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
        
}
    public void movement(int direccion){
    switch(direccion){
        case 0:
        setRotation(270);
        setLocation(getX(),getY()-5);
        if((isTouching(esquinaInferiorUniversalDerecha.class) || isTouching(esquinaInferiorUniversalIzquierda.class) || isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class))){
        setLocation(getX(),getY()+5);}
        break;
         case 1:
        setRotation(90);
        setLocation(getX(),getY()+5);
        if((isTouching(esquinaInferiorUniversalDerecha.class) || isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class) )){
        setLocation(getX(),getY()-5);}
        break;
         case 2:
        setRotation(0);
        setLocation(getX()-5,getY());
        if((isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaInferiorUniversalDerecha.class) ||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class) )){
        setLocation(getX()+5,getY());}
        if((isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaInferiorUniversalDerecha.class) ||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class))){
        setLocation(getX()+5,getY());}
        break;
         case 3:
        setRotation(0);
        setLocation(getX()+5,getY());
        if((isTouching(esquinaInferiorUniversalDerecha.class)||isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class) )){
        setLocation(getX()-5,getY());}
        if((isTouching(esquinaInferiorUniversalDerecha.class)||isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class) )){
        setLocation(getX()-5,getY()-5);}
        break;
    }
    
    
    }
}
