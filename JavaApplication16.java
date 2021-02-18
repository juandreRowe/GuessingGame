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
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Player player = new Player(getPlayerName());
        GuessGame game = new GuessGame();
        game.play();
    }
    
    public static String getPlayerName(){
        System.out.println("Enter your name gamer!");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
