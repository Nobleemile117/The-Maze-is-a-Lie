import lang.stride.*;
import java.util.*;
import greenfoot.*;
import javax.swing.JOptionPane;
/**
 * 
 */
public class Menu extends World
{
    private int opcion = 0;
    private GreenfootSound theme =  new  GreenfootSound("menuTheme.mp3");
    private Leaderboard leaderboard = new Leaderboard();
    private historyButton history = new historyButton();
    private Puntero puntero =  new  Puntero();

    /**
     * Constructor for objects of class Menu.
     */
    public Menu()
    {
        super(800, 500, 1);
        preparamundo();
    }

    /**
     * 
     */
    private void preparamundo()
    {

        addObject( new Title(), 400, 100);

        addObject( new  Jugar(), 400, 250);

        addObject( new  Salir(), 400, 350);
        addObject(puntero, 165, 250);
        addObject(history,735,60);
        addObject(leaderboard, 400, 450);

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

        puntero.setLocation(165, 250 + (opcion * 100));

        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")) {
            switch (opcion) {
                case 1 : 
                theme.stop();
                Greenfoot.stop();

                break;

                /*case 2 : {
                Greenfoot.setWorld( new  Leaderboards());

                break;
                }*/
                case 0 : 

                theme.stop();
                Greenfoot.setWorld( new  Maze1());

                break;

            }
        }
        if(Greenfoot.mouseClicked(leaderboard)){
            theme.stop();
            Greenfoot.setWorld( new  Leaderboards());
        }
        if(Greenfoot.mouseClicked(history)){
            JOptionPane.showConfirmDialog(null,
                "Después de la caida de Aperture Science, nuestra protagonista Chell, se ve en la obligación de escapar de las instalaciones lo más pronto posible, ya que no cuenta con mucho tiempo. \n Las paredes se han convertido en un obstaculo para ella, y su pistola de portales, esta practicamente inservible. \n Aunque... hay una pequeña posibilidad de escape, al descomponerse la pistola de portales, se crearon dos ultimas conexiones. \n Es su UNICA escapatoria.", "DEEP LORE!", JOptionPane.DEFAULT_OPTION);
        }
    }

}
