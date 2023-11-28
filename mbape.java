import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mbape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mbape extends Actor
{
    public int temp = 20;
    /**
     * Act - do whatever the mbape wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();// Add your action code here.
        acertarAlvo();
    }
    
    public void moveAtaque(){
    double angle = Math.toRadians(getRotation());
    int x = (int) Math.round(getX() - Math.cos (angle));
    int y = (int) Math.round(getY() + Math.sin (angle));
    
    setLocation(x,y);
    }
      public void acertarAlvo(){
    Actor a = getOneIntersectingObject(naruto.class);
    temp--;
    if(a != null){
        Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        counter2.add(1);
        if(temp < 1){
        neyvitoria world = new neyvitoria();
        Greenfoot.setWorld(world);
        getWorld().removeObject(a);
        getWorld().removeObject(this);
    }
    }
}
}
