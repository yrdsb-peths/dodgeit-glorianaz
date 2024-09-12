import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fries here.
 * 
 * @author Gloriana Zheng
 * @version Sept.12 2024
 */
public class Fries extends Actor
{
    /**
     * Act - do whatever the Fries wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        
        if(getX() <= 0)
        {
            resetFries();
        }
        
    }
    
    public void resetFries()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
        }else 
        {
            setLocation(600, 300);
        }
        
    }
}
