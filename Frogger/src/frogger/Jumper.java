/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

import java.util.*;

/**
 * A class used to create a Jumper charcter for the Frogger game.
 * @author Mark Freeman
 */
public class Jumper extends ThirdTurn {
    
    /**
    * A constructor that creates a jumper character.
    */
    public Jumper(int x, int y)
    {
        super(x,y);
    }
    
    /**
    * A method that makes the character sprite for jumper j.
    * @return The character sprite for jumper
    */
    @Override
    public String getMarker()
    {
        return super.getMarker() + "J";
    }
    
    /**
    * A method that will make the jumper move to a random x coordinate every
    * three turns.
    * @param playerX the current x coordinate of the player.
    * @param playerY th current y corrdiante of the player.
    */
    @Override
    public void act(int playerX, int playerY)
    {
        Random new_number = new Random(); //creates random number object
        
        if(super.getAction() == 0)
        {
             super.setX(new_number.nextInt(9));
        }   
        
        super.incrementAction();
    }
    
}
