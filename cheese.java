import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cheese extends Actor
{
    /**
     * Act - do whatever the cheese wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(4);
        if(Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(15)-30);
        }
        
        
        
    }    
}
