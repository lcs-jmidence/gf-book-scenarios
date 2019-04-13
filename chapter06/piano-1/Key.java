import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * These can be used anywhere in the class below
     */
    //Will keep track of  whether a key was just pressed
    private boolean KeyAlreadyDown;

    /**
     * Create a new key.
     */
    public Key()
    {
        KeyAlreadyDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        // Animate the piano key being pressed
        // Condition 1 - is the "g" key being pressed
        // Condition 2 - was the "g" key already down
        if (Greenfoot.isKeyDown("g") && KeyAlreadyDown == false)
        {
            //key is down
            setImage("white-key-down.png");
            play();
            KeyAlreadyDown = true;
        }

        // Stop showing the key being pressed
        // Condition 1 - The Key was down the last time act() fired]
        // Condition 2 - The "g" has been released (no longer being pressed)
        if ((KeyAlreadyDown == true) && Greenfoot.isKeyDown("g") == false)
        {
            //key is up
            setImage("white-key.png");
            KeyAlreadyDown = false;
        }
    }

    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");   
    }
}

