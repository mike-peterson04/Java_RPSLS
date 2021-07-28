/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

/**
 *
 * @author Admin
 */
public abstract class Player {
    String name;
    int victories;
    public Player(String playerName){
        name = playerName;
        victories = 0;      
    }
    
    public abstract String SelectSign();
    
    public void WinRound(){
        victories++;
    }
    
}
