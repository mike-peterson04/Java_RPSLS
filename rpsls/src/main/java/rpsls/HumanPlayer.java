/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HumanPlayer extends Player {
    Scanner keyboard;
    
    public HumanPlayer(String PlayerName){
       super(PlayerName);
       keyboard = new Scanner(System.in);
    }
    
    @Override
    public String SelectSign(){
        String gesture = "ERROR";
        OUTER:
        while (true) {
            System.out.println("Please select a gesture");
            System.out.println("1 for Rock");
            System.out.println("2 for Paper");
            System.out.println("3 for Scissors");
            System.out.println("4 for Lizard");
            System.out.println("5 for Spock");
            String gestureIndex = keyboard.nextLine();
            if (null != gestureIndex) {
                switch (gestureIndex) {
                    case "1":
                        gesture = "ROCK";
                        break OUTER;
                    case "2":
                        gesture = "PAPER";
                        break OUTER;
                    case "3":
                        gesture = "SCISSORS";
                        break OUTER;
                    case "4":
                        gesture = "LIZARD";
                        break OUTER;
                    case "5":
                        gesture = "SPOCK";
                        break OUTER;
                    default:
                        System.out.println("Please enter a number between 1-5");
                        break;
                }
            }
        }
        
        return gesture;
    }
    
}
