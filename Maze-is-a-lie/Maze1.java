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
        
        /**
         * Constructor for objects of class Maze1.
         * 
         */
        public Maze1()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(800, 600, 1);
            createMaze();
            addObject(chell, 400, 300);
        }
        
        public void act(){
        theme2.play();
        
        }
        
        public void createMaze(){
            File file = new File("Maze1.txt");
            
            FileReader fileR = null;
            BufferedReader file2 = null;
            int punterox=0;
            int punteroy=0;
            
            try {
                fileR = new FileReader(file);
                file2 = new BufferedReader(fileR);
                
            }catch (FileNotFoundException e) {
                System.out.println("No se encontro el archivo "+file.getName());
            }
            
            try{
                while(file2.readLine() != null)
                {
                    int line = file2.read();
                    switch(line){
                        case 1:
                            addObject(new esquinasuperiorIzquierda(),punterox,punteroy);
                            punterox+=35;
                            break;
                        
                        case 2:
                            addObject(new paredhorizontalSuperior(),punterox,punteroy);
                            punterox+=35;
                            break;
                        
                        case 3:
                            addObject(new esquinasuperiorderecha(),punterox,punteroy);
                            punterox=0;
                            punteroy+=35;
                            break;
                    }
                    System.out.println(line);
                }
            }catch(IOException e){
                    e.printStackTrace();
            }
    }
   
}
