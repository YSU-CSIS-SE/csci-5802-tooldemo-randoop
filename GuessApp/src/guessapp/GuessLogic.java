/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessapp;

import java.util.*;

 /**
 *This class creates a random number between 1 and MAX_GUESS and provides the 
 * logic needed to guess numbers until the random number is found.
 * The user can play the game as much as they want.
 * @author Mark Freeman
 * @since 10/10/16
 */
public class GuessLogic {
    
    //Maximum possible value of random number.
    private static final int MAX_GUESS = 10; 
    private int count; //total number of guesses
    private int right_answer; //A randomly chosen answer
    private boolean[] guessed = new boolean[MAX_GUESS]; //Records numbers that are guessed.
    
/**
 *Constructor that creates a new number to guess.
 * Also sets all variables in the guessed array to false.
 */
    public GuessLogic()
    {
        Random new_number = new Random();
        right_answer = new_number.nextInt(MAX_GUESS) + 1;
        
        for (int i = 0; i < MAX_GUESS; i++)
            guessed[i] = false;
        
        count = 0;
    }
    
/**
 * Verifies that the guess made by the user is legal.
 * If the guess is not between 1 and MAX_GUESS, then the function is false.
 * @param user_guess The player's guess
 * @return A boolean that is true if the guess is legal.
 */
    public boolean legalGuess(int user_guess)
    {
        return (user_guess <= MAX_GUESS && user_guess >= 1);
    }
    
    /**
    * Checks to see if the player has already guessed a number.
    * @param user_guess The player's guess
    * @return A boolean that is true if guessed[user_guess - 1] has already
    * been tried.
    */
    public boolean alreadyGuessed(int user_guess)
    {
        return (guessed[user_guess - 1]);
    }
    
   /**
    *Get the number of guesses that have been made.
    * @return The number of guesses.
    */
    public int count()
    {
        return count;
    }
    
   /**
    *Verifies if the player's guess is the same as the random number.
    * @param user_guess The player's guess.
    * @return A boolean that is true if user_guess is the random number.
    */
    public boolean guessing(int user_guess)
    {
        //Verifies user_guess is between 1 and MAX_GUESS
        if( user_guess > MAX_GUESS || user_guess < 1)
            return false;   
        
        //Verifies that guess hasn't already been made
        if(guessed[user_guess - 1] == true)
            return false;
        
        if(user_guess == right_answer)
        {
            guessed[user_guess - 1] = true;
            count++;
            return true;
        }
        else
        {
            guessed[user_guess - 1] = true;
            count++;
            return false;
        }
    }
    
     /**
    * Checks to see if the game is over.
    * @param user_guess The player's guess.
    * @return A boolean that is true if the player's guess is the random number.
    */
    public boolean gameOver(int user_guess)
    {
        if (user_guess == right_answer)
            return true;
        else
            return false;
    }
    
    /**
    *Get the maximum number the random number can be.
    * @return The largest possible size of the random number.
    */
    public int returnMaximum()
    {
        return MAX_GUESS;
    }
    
    
    /**
     * Returns the member variables in the form of a single string.
     * It is solely meant for testing.
     * @return The variables of the object.
     */
    public String toString()
    {
        String result = "The random number is between 1 and " + MAX_GUESS + ". " 
          + "The random number is: " + right_answer + ". " + 
          " The number of tries is " + count + ". " 
          + "The numbers that have been guessed are: ";
        
        for(int i = 0; i< MAX_GUESS; i++)
        {
            if(guessed[i] == true)
                result += i+1 + ", ";
        }
        return result;
    }
}
