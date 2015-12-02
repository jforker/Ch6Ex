import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    
    private String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "\\"};
    private String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        prepare();
        
    }
    
    private void prepare()
    { 
        makeKeys();
    }
    
   public void makeKeys()
   {
       int i = 0;
       while(i < whiteKeys.length)
       {
           Key key = new Key(whiteKeys[i], whiteNotes[i] + ".wav");
           addObject(key, i*63 + 54, 140);
           i++;
        }
    }
    
    
     /**
     * 
     */
    public void act()
    {
    }
}