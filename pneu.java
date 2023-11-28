import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pneu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pneu extends Actor
{
    public int temp = 20;
    /**
     * Act - do whatever the pneu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();// Add your action code here.
        acertarAlvo();
    }
    public void moveAtaque(){
    double angle = Math.toRadians(getRotation());
    int x = (int) Math.round(getX() + Math.cos (angle));
    int y = (int) Math.round(getY() + Math.sin (angle));
    
    setLocation(x,y);
    }
    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(neymar.class);
    temp--;
    if(b != null){
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        if(temp < 1){
        narutovitoria world = new narutovitoria();
        Greenfoot.setWorld(world);
        getWorld().removeObject(b);
        getWorld().removeObject(this);
    }
    }
}
}
