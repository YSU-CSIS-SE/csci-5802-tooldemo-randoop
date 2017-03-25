/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessapp;

import java.util.*;
import java.lang.*; //provides toLowerCase

/**
 * This application allows a player to guess a number between 1 and MAX_GUESS
 * and keeps track of how many tries it takes. The player can also replay the 
 * game as much as they want.
 * @author Mark Freeman
 * @since 10/10/16
 */
public class GuessApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     
     int player_guess; //Guess made by the player
     char continue_game; //Used to continue game or not
     
     System.out.print("Welcome to the Guess the Number game. ");
     
     do{
        continue_game = ' '; //Resets continue_game after each loop.
        GuessLogic game = new GuessLogic(); //Creates GuessLogic object.
     
        do
        {
            System.out.println("Guess a number between 1 and " 
                    + game.returnMaximum());
            player_guess = input.nextInt();
            
            //Tests if player_guess is in bounds
            if(!game.legalGuess(player_guess))
            {
              System.out.println("Your guess is not between 1 and " + 10 + ".");
              continue;
            }
            
            //Tests if player_guess has already been guessed.
            if(game.alreadyGuessed(player_guess))
            {
                System.out.println("You've already guessed that!");
                continue;
            }
            
            //Compares player_guess to right_answer
            if(game.guessing(player_guess))
            {
                System.out.println("You are correct! You guessed it in " 
                        + game.count() + " tries.");
            }
            else
                System.out.println("Nope. Try again.");
        }while(!game.gameOver(player_guess));
        
        System.out.println("\n" + game.toString());
        
        //Loops until continue_game is either y or n
        while(Character.toLowerCase(continue_game) != 'y' && 
                Character.toLowerCase(continue_game) != 'n')
        {
        System.out.print("Would you like to play again?\n "
                + "(y for yes, n for no).");
        continue_game = input.next(".").charAt(0);
        }
     
     }while(Character.toLowerCase(continue_game) != 'n');  
    
     System.out.print("Thanks for playing!");
    }
}
