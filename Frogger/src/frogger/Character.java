/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * This is an abstract class used to create a character for the Frogger game.
 * @author Mark Freeman
 */
public abstract class Character {
    
    private int x; //Character's x coordinate
    private int y; // Character's y coordinate
    private String sprite; //Character's sprite
    
    /**
    * Constructor for an abastrat clsss that takes the initial x and y position 
    * of a characeter.
    * Also creates a sprite object to be added to in a subclass
    */
    public Character( int position_x, int position_y)
    {
        x = position_x;
        y = position_y;
        sprite = "";
    }
    
    /**
    * Sets the value for variable x.
    * @param num New x coordinate.
    */
    protected void setX(int num)
    {
        x = num;
    }
    
    /**
    * Sets the value for variable x.
    * @param new New Y coordinate.
    */
    protected void setY(int num)
    {
        y = num;
    }
    
    /**
    * Returns the value of x.
    * @return The current value of x.
    */
    public int getX()
    {
        return x;
    }
    
    /**
    * Returns the value of y.
    * @return The current value of y.
    */
    public int getY()
    {
        return y;
    }
    
    /**
    * Returns the value of the character sprite.
    * @return The current value of the character sprite.
    */
    public String getMarker()
    {
        return sprite;
    }
    
    /**
    * Returns a boolean that is true if the character sprite is visible.
    * @return true.
    */
    public boolean isVisible()
    {
        return true;
    }
    
    /**
    * An abstract class to be overriden.
    * @param playerX the current x coordinate of the player.
    * @param playerY th current y corrdiante of the player.
    */
    public abstract void act(int playerX, int playerY);
}
