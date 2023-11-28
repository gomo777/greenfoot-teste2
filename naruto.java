import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class naruto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class naruto extends Actor
{   
    GifImage myGif= new GifImage("naruto.gif");
    public int speed=5;
    public int temp = 20;
    /**
     * Act - do whatever the naruto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        setImage(myGif.getCurrentImage());
        moviment();
    }
    public void moviment () {
        if (Greenfoot.isKeyDown("w")) {
        this.setLocation(this.getX(), this.getY () - speed) ;
    }
        if (Greenfoot.isKeyDown("s")) {
        this.setLocation(this.getX(), this. getY () + speed) ;
    }
        if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY ()) ;
    }
        if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY ()) ;
    }
    if (Greenfoot.isKeyDown("g")) {
        getWorld().addObject(new pneu(),getX() -100 , getY () +30);
    }
}
}
