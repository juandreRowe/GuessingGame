/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author juandre
 */
public class Player {
    private final String name;
    
    public Player(){
        this("Unknown");
    }
    
    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
