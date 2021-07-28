/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

import static java.lang.Integer.parseInt;
import java.util.Hashtable;
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
        this.runMatch();
        
        
    }
    private void runMatch(){
        while(!this.chooseWinner()){
            this.playGame().WinRound();
        }
        
    }
    
    private boolean chooseWinner(){
        if(this.player1.victories>=this.toWin){
            System.out.println("Congratulations to "+this.player1.name+" on winning");
            return true;
        }
        else if(this.player2.victories>=this.toWin){
            System.out.println("Congratulations to "+this.player2.name+" on winning");
            return true;
        }
        else{
            
            return false;
        }
    }
    
    private Player playGame(){
       Hashtable<String,String> winningCombo = new Hashtable<String,String>();
       winningCombo.put("ROCKSCISSORS", "Rock smashes Scissors");
       winningCombo.put("ROCKLIZARD", "Rock crushes Lizard");
       winningCombo.put("PAPERROCK", "Paper covers Rock");
       winningCombo.put("PAPERSPOCK", "Paper disproves Spock");
       winningCombo.put("SCISSORSPAPER", "Scissors cut Paper");
       winningCombo.put("SCISSORSLIZARD", "Scissors decapitate Lizard");
       winningCombo.put("LIZARDPAPER", "Lizard eats Paper");
       winningCombo.put("LIZARDSPOCK", "Lizard poisons Spock");
       winningCombo.put("SPOCKSCISSORS", "Spock uses Scissors");
       winningCombo.put("SPOCKROCK", "Spock vaporizes Rock");
        while(true){
            String first = this.player1.SelectSign();
            String second = this.player2.SelectSign();
            if (first.equals(second)){
                System.out.println("This round was a Tie, Play again");
            }
            else if(winningCombo.contains(first+second)){
                System.out.println(this.player1.name+" wins as their "+winningCombo.get(first+second));
                return this.player1;
            }
            else if(winningCombo.contains(second+first)){
                System.out.println(this.player2.name+" wins as their "+winningCombo.get(second+first));
                return this.player2;
            }
            else{
                System.out.println("Something went wrong please try playing again");
            }
            
            
        }
               
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
