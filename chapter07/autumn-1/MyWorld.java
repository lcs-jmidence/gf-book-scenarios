import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
        // Add 18 Leaf Objects
        for (int l = 1; l <= 18; l += 1)
        {
            Leaf aLeaf = new Leaf();
            //Spawn point
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(400);
            //Add the object to the world
            addObject(aLeaf, x, y);
        }
    }

    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
    }
}
