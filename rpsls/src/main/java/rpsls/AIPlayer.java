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
        int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        switch (randomNum) {
                    case 1 -> {
                        gesture = "ROCK";
                        break;
                    }
                    case 2 -> {
                        gesture = "PAPER";
                        break;
                    }
                    case 3 -> {
                        gesture = "SCISSORS";
                        break;
                    }
                    case 4 -> {
                        gesture = "LIZARD";
                        break;
                    }
                    case 5 -> {
                        gesture = "SPOCK";
                        break;
                    }
                    default -> System.out.println("Please enter a number between 1-5");
                }
        return gesture;
    }
    
}
