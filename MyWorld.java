import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Gloriana Zheng
 * @version Sept. 12 2024
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Fries fries = new Fries();
        addObject(fries, 600, 100);
    }
}
