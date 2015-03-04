/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import java.util.Scanner;


public class MainMenuView extends View{

    public MainMenuView(){
        super("\n"
            + "\n-------------------------------------------"
            + "\n| Main Menu                               |"
            + "\n-------------------------------------------"
            + "\nP - Play New Game"
            + "\nS - Save Game"
            + "\nL - Load Game"
            + "\nH - Help"
            + "\nE - Exit");
    }

    private void doAction(char selection) {
        
        switch (selection){
            //create new game
            case 'P':
                this.startNewGame();
                break;
            //help menu
            case 'H':
                this.displayHelpMenu();
                break;
            //save game
            case 'S':
                this.saveGame();
                break;
            //load game
            case 'L':
                this.startExistingGame();
            //exit
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
        //Start new game function will create new player and will then call the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    @Override
    public void doAction(String Value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

