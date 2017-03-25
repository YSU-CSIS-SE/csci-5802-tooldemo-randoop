/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * A class used to create a Patroller character for the Frogger game.
 * @author Mark Freeman
 */
public class Patroller extends Character {
    
    private String sprite_direction;
    
   /**
    * A constructor that creates a Patroller character and determines its 
    * direction.
    */
    public Patroller(int x, int y, String direction) throws wrongDirectionException
    {
        super(x,y);
        
        //direction can only be right or left
        if(!direction.equals("right") && !direction.equals("left"))
            throw new wrongDirectionException();
        
        sprite_direction = direction;
    }
    
       /**
    * A method that makes the character sprite of Hider P.
    * @return The Hider character sprite.
    */
    @Override
    public String getMarker()
    {
        return super.getMarker() + "P";
    }
  
   /**
    * A method that will make the Patroller move in its designated direction 
    * every turn.
    * @param playerX the current x coordinate of the player.
    * @param playerY th current y corrdiante of the player.
    */
    @Override
    public void act (int playerX, int playerY)
    {
        if(sprite_direction.equals("left") && super.getX() == 0)
            super.setX(8);
        else if(sprite_direction.equals("right") && super.getX() == 8)
            super.setX(0);
        else if(sprite_direction.equals("right")) 
            super.setX(super.getX() + 1);
        else if(sprite_direction.equals("left"))
            super.setX(super.getX() - 1);
            
    }
}
