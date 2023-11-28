import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class neyvitoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class neyvitoria extends World
{
    public int temp = 20;

    /**
     * Constructor for objects of class neyvitoria.
     * 
     */
    public neyvitoria()
    {
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
