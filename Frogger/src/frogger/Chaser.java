/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * A class used to create a Chaser charcter for the Frogger game.
 * @author Mark Freeman
 */
public class Chaser extends ThirdTurn{
    
   /**
    * A Constructor that creates a Chaser character.
    */
    public Chaser(int x, int y)
    {
        super(x,y);
    }
    
   /**
    * A method that will make the character sprite for Chaser C.
    * @ return Chaser character sprite.
    */
    @Override
     public String getMarker()
    {
        return super.getMarker() + "C";
    }
        /**
    * A method that will make the Chaser move towards the player.
    * @param playerX the current x coordinate of the player.
    * @param playerY th current y coordinate of the player.
    */
     @Override
    public void act(int playerX, int playerY)
    {
        
        if(super.getAction() == 0)
        {
            //Move towards the player along the x axis
            if(super.getX() > playerX) 
                super.setX(super.getX() - 1);
            else if(super.getX() < playerX)
                super.setX(super.getX() + 1);
            
            //Move towards the player on the y axis.
            if(super.getY() > playerY)
                super.setY(super.getY() - 1);
            else if(super.getY() < playerY)
                super.setY(super.getY() + 1);
        }
        
        super.incrementAction();

    }   
}
