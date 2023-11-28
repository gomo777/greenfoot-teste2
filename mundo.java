import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author guizn_rl 
 * @version 0.1 Alpha
 */
public class mundo extends World
{

    /**
     * Constructor for objects of class mundo.
     * 
     */
    private GreenfootSound bgMusic = new GreenfootSound("trilhadefundo.mp3");
    public void started(){
    bgMusic.playLoop();
    }
    
    public void stopped(){
    bgMusic.pause();
    }
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        neymar neymar = new neymar();
        addObject(neymar,737,461);
        naruto naruto = new naruto();
        addObject(naruto,80,473);
        Counter counter = new Counter();
        addObject(counter,732,40);
        counter.setLocation(84,54);
        Counter2 counter2 = new Counter2();
        addObject(counter2,696,41);
    }
}
