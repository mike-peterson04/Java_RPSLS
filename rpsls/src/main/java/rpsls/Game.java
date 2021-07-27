/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Game {
    Player player1;
    Player player2;
    Scanner keyboard;
    
    public Game(){
        keyboard = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Are you playing:");
                System.out.println("Press 1 for a Single Player against AI");
                System.out.println("Press 2 for a Multiplayer against a friend");
                System.out.println("press 3 for a Simulation games with multiple AI");
                String gameType;
            
                gameType = keyboard.nextLine();
                if(parseInt(gameType) == 1){
                    System.out.println("1");
                    break;
                    
                }
                else if(parseInt(gameType) == 2){
                    System.out.println("2");
                    break;
                    
                }
                else if(parseInt(gameType) == 3){
                    System.out.println("3");
                    break;
                    
                }
                else{
                    System.out.println("Please enter a number between 1 and 3");
                    
                }
                
            }
            catch(Exception e){
                System.out.println("Please enter a number between 1 and 3");
                System.out.println(e);
            }
            
        }
    }
    
}
