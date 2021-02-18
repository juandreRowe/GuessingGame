/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author juandre
 */
public class GuessGame {
    private final int numberToGuess;
    private final int max; //Top boundry
    private final int min; //Bottom boundry
    private int numberOfGuesses;
    private final Player player;
    
    public GuessGame(){
        this(0, 100, new Player());
    }
    
    public GuessGame(int min, int max, Player player){
        this.min = min;
        this.max = max;
        this.numberToGuess = (int)(Math.random() * (max - min + 1) ) + min; //number between min and max
        this.numberOfGuesses = 0;
        this.player = player;
    }
    
    public int getGuess(){
        System.out.printf("Guess the number between %s and %s\n", min, max);
        Scanner scanner = new Scanner(System.in);
        try{
            int guess = scanner.nextInt();
            if(validGuess(guess)) return guess;
            throw new Exception();
        }catch(Exception ex){
            System.out.printf("Enter number between %s and %s\n", min, max);
            return getGuess();
        }
    }
    
    //checks if guess is in range
    public boolean validGuess(int guess){
        return(guess < max && guess > min);
    }
    
    public void incrementGuess(){
        numberOfGuesses++;
    }
    
    public void play(){
        while(true){
            incrementGuess();
            int guess = getGuess();
            
            if(guess > numberToGuess){
                System.out.println("Number is lower than current guess");
            }else if(guess < numberToGuess){
                System.out.println("Number is higher than current guess");
            }else{
                System.out.println("The number was : " + guess + " and took you only " + numberOfGuesses + " guesses.\nThanks for playing " + player.getName());
                break;
            }
        }
    }
}
