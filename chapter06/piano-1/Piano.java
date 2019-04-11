import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance Variables
     * (we can use the variables anywhere in the class)
     */
    int frames;
    
    // Create the array (list of names)
    String[] peopleInClass = {"Julio", "Liam", "Dima", "Osman", "Nick", "Simon", "Eric", "Phillip", 
        "Joven", "Joe", "Gordon", "Jieun", "Selena", "Jason", "Sam", "Jeff"};
    public Piano() 
    {
        super(800, 340, 1);
        
        // Initialize the frames
        frames = 0;
    }
    
    /**
 * act
 * (gets called repeatedly
 */
public void act()
{
    // Track Frames
    frames += 1;
    
    // Show the frames
    showText("" + frames, 100, 100);
}
}
