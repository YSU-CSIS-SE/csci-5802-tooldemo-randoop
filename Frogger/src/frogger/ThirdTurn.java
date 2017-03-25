/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frogger;

/**
 * An abstract class that is extended by objects that move every three turns.
 * @author Mark Freeman
 */
public abstract class ThirdTurn extends Character {
    
    private int action; //Turns until the character moves.
    
    /**
    * An abstract constructor that is called on to make a character move 
    * every three turns.
    */
    public ThirdTurn(int position_x, int position_y)
    {
        super(position_x, position_y);
        action = 2;  
    }
    
    /**
    * A method that subtracts from action until it reaches zero and a character 
    * moves. After the character moves, action resets to 2.
    * @param playerX the current x coordinate of the player.
    * @param playerY th current y corrdiante of the player.
    */
    protected void incrementAction()
    {   
        if(action <= 0)
            action = 2;
        else
            action --;
    }
    
    /**
    * A method that returns the value of action.
    * @return action The number of turns before the character moves.
    */
    protected int getAction()
    {
        return action;
    }
    
   
}
