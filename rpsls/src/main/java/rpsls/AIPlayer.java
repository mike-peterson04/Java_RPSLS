/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class AIPlayer extends Player {
    
    public AIPlayer(String PlayerName){
       super(PlayerName);  
    }
    
    
    @Override
    public String SelectSign(){
        String gesture = "ERROR";
        return gesture;
    }
    
}
