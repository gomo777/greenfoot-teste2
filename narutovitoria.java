import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class narutovitoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class narutovitoria extends World
{
    public int temp = 20;
    /**
     * Constructor for objects of class narutovitoria.
     * 
     */
    public narutovitoria()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
        temp--;
        if (Greenfoot.isKeyDown("enter") && (temp < 1)) {
            intro world = new intro();
            Greenfoot.setWorld(world);
        }
    }
}