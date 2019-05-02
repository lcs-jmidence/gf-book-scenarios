import greenfoot.*;
// In order to use a list in Java, we must import it
import java.util.List;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;

    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        CheckForLeafCollision();
    }

    private void CheckForLeafCollision()
    {
        // Get an object reference to a single Leaf from any Leaf object we are currenlty
        // Intersecting
        Leaf someLeaf = (Leaf)getOneIntersectingObject(Leaf.class);
        // Check that the someLeaf object actually has a reference to an object
        // If it's null, that means there was no Leaf intersecting the Block this time around
        if(someLeaf !=null)
        {
            removeTouching(Leaf.class);
        }
    }

    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }

    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
            // Add a new leaf object to the world
            // Add a refrence to the World
            World myWorld = getWorld();
            // Use the object refrence to call, or use, a method on the World Object
            myWorld.addObject(new Leaf(), getX(), getY());
        }
    }

    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        // When null is the argument, Greenfoot responds to a mouse click anywhere on screen
        // When this is the argument, Greenfoot responds to a mouse click Only on the block object
        if (Greenfoot.mouseClicked(this)) 
        {
            // Get an object reference to the world
            World myWorld = getWorld();
            // Make a message show on screen when th mouse is clicked
            myWorld.showText("Mouse Has Been Clicked", 200, 200);
        }
    }

}
