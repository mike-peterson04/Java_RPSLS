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
public class HumanPlayer extends Player {
    
    public HumanPlayer(String PlayerName){
       super(PlayerName);  
    }
    
    @Override
    public String SelectSign(){
        String gesture = "ERROR";
        return gesture;
    }
    
}
