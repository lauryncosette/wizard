/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.model.GameMenuView;
import byui.cit260.detectiveWizard.model.Player;

/**
 *
 * @author Cassandra
 */
public class MainMenuView {
    
    private final String MENU = "\n"
           + "\n--------------------"
           + "\n| Main Menu            |"
           + "\n--------------------"
           + "\nG - Start Game"
           + "\nH - Get help on how to play the game"
           + "\nS - Save Game"
           + "\nE - Exit"
           + "\n--------------------";
    private Object detectiveWizard;
           
           

    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);// display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
                      
        } while (selection != 'E'); // a selection is not "Exit"
    }

    public void doAction(char choice) {
        
        switch (choice) {
            case 'N': // create and start a game
                this.startNewGame();
                break;               
            case 'G': // get and start an existing game
                this.startExistingGame();
                break;        
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'E': // Exit the game
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
                
        }
    }

    private String getInput() {
        return null;
        
    }

    private void startNewGame() {
                // create a new game
            GameControl.createNewGame(detectiveWizard.getPlayer());
            
            // display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();
            
            System.out.println("*** startNewGame function called ***");
    }
    
   private void startExistingGame() {
       System.out.println("*** startExistingGame function called ***");
   }
   
   private void saveGame() {
       System.out.println("*** saveGame function called ***");       
   }
   
   private void displayHelpMenu() {
       System.out.println("*** displayHelpMenu function called ***");
   }
    
   public class GameControl {
       
       public static void createNewGame(Player player){
           System.out.println("\n*** createNewGame stub function called ***");
       }
   }
   
   public class GameMenuView{
       void displayMenu() {
           System.out.println("\n*** displayMenu stub function called ***");
       }
   }
}
