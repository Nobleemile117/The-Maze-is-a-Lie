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
<<<<<<< HEAD
        if((isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaInferiorUniversalDerecha.class) ||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class) )){
        setLocation(getX(),getY()-5);}
=======
        if(isTouching(esquinaInferiorUniversalIzquierda.class||esquinaInferiorUniversalDerecha.class ||esquinaSuperiorUniversalDerecha.class||esquinaSuperiorUniversalIzquierda.class||esquinainferiorDerecha.class||esquinainferiorizquierda.class||esquinasuperiorIzquierda.class||esquinasuperiorderecha.class||interseccionDerecha.class||interseccionInferior.class||interseccionIzquierda.class|| esquinaInferiorUniversalIzquierda.class||interseccionSuperior.class||interseccionUniversal.class||paredHorizontal.class||paredHorizontalInferior.class||paredHorizontalSuperior.class||paredVertical.class||paredVerticalDerecha.class||paredVerticalIzquierda.class )){
        setLocation(getX()+5,getY());}
>>>>>>> 72164b8ab4bead854b85fb7f6e0d7eed2583bc40
        break;
         case 3:
        setRotation(0);
        setLocation(getX()+5,getY());
<<<<<<< HEAD
        if((isTouching(esquinaInferiorUniversalDerecha.class)||isTouching(esquinaInferiorUniversalIzquierda.class)||isTouching(esquinaSuperiorUniversalDerecha.class)||isTouching(esquinaSuperiorUniversalIzquierda.class)||isTouching(esquinainferiorDerecha.class)||isTouching(esquinainferiorizquierda.class)||isTouching(esquinasuperiorIzquierda.class)||isTouching(esquinasuperiorderecha.class)||isTouching(interseccionDerecha.class)||isTouching(interseccionInferior.class)||isTouching(interseccionIzquierda.class)||isTouching( esquinaInferiorUniversalIzquierda.class)||isTouching(interseccionSuperior.class)||isTouching(interseccionUniversal.class)||isTouching(paredHorizontal.class)||isTouching(paredHorizontalInferior.class)||isTouching(paredHorizontalSuperior.class)||isTouching(paredVertical.class)||isTouching(paredVerticalDerecha.class)||isTouching(paredVerticalIzquierda.class) )){
        setLocation(getX(),getY()-5);}
=======
        if(isTouching(esquinaInferiorUniversalDerecha.class||esquinaInferiorUniversalIzquierda.class||esquinaSuperiorUniversalDerecha.class||esquinaSuperiorUniversalIzquierda.class||esquinainferiorDerecha.class||esquinainferiorizquierda.class||esquinasuperiorIzquierda.class||esquinasuperiorderecha.class||interseccionDerecha.class||interseccionInferior.class||interseccionIzquierda.class|| esquinaInferiorUniversalIzquierda.class||interseccionSuperior.class||interseccionUniversal.class||paredHorizontal.class||paredHorizontalInferior.class||paredHorizontalSuperior.class||paredVertical.class||paredVerticalDerecha.class||paredVerticalIzquierda.class )){
        setLocation(getX()-5,getY()-5);}
>>>>>>> 72164b8ab4bead854b85fb7f6e0d7eed2583bc40
        break;
    }
    
    
    }
}
