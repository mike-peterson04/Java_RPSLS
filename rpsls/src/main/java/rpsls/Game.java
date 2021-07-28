/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class Game {
    Player player1;
    Player player2;
    Scanner keyboard;
    int toWin;
    
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
                    player1 = new HumanPlayer(this.nameHuman());
                    player2 = new AIPlayer(this.nameAI());
                    break;
                    
                }
                else if(parseInt(gameType) == 2){
                    player1 = new HumanPlayer(this.nameHuman());
                    player2 = new HumanPlayer(this.nameHuman());
                    break;
                    
                }
                else if(parseInt(gameType) == 3){
                    player1 = new AIPlayer(this.nameAI());
                    player2 = new AIPlayer(this.nameAI());
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
        this.setToWin();
        
        
    }
    
    private void setToWin(){
        while(true){
            try{
                System.out.println("This match will be a best of how many games? (minimum 3):");
                String gameToWin;
                gameToWin = keyboard.nextLine();
                 if(parseInt(gameToWin) >= 3 && parseInt(gameToWin)%2 > 0){
                    this.toWin = (parseInt(gameToWin)/2)+1;
                    break;
                    
                }
                else{
                    System.out.println("Please enter a odd number greater than 3");
                    
                }
                
               
                
            }
            catch(Exception e){
                System.out.println("Please enter a odd number greater than 3");
                System.out.println(e);
            }
            
        }
        
        
    }
    
    private String nameHuman(){
        System.out.println("Please enter a players name:");
        return keyboard.nextLine();
    }
    
    private String nameAI(){
       int randomNum = ThreadLocalRandom.current().nextInt(0, 9999 + 1); 
       return("Player:"+randomNum);
    }
    
}
