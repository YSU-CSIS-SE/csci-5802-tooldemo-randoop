/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 *
 * @author esplin
 */
public class Hider extends Character {
    private boolean visible;
    
        /**
    * A constructor that creates a Hider character and creates a boolean object
    * that is true if the character is visible.
    */
    public Hider(int position_x, int position_y)
    {
        super(position_x,position_y);
        visible = true; //Boolean that determines if Hider is visible
    }
    
   /**
    * A method that makes the character sprite of Hider H.
    * @return The Hider character sprite.
    */
    @Override
    public String getMarker()
    {
        return super.getMarker() + "H";
    }
    
   /**
    * A method that will make the Hider change from visible to invisible every
    * turn.
    * @param playerX the current x coordinate of the player.
    * @param playerY th current y coordiante of the player.
    */
    @Override
    public void act(int playerX, int playerY)
    {
        if(visible)
            visible = false;
        else
            visible = true;
    }
    
   /**
    * A method that is true if hider is visible.
    * @return Returns true if the Hider is visible
    */
    @Override
    public boolean isVisible()
    {
        return visible;
    }
}
