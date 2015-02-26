/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import java.util.Scanner;


public class MainMenuView {

    //Code for displaying MainMenu
    private final String MENU = "\n"
            + "\n-------------------------------------------"
            + "\n| Main Menu                               |"
            + "\n-------------------------------------------"
            + "\nP - Play New Game"
            + "\nS - Save Game"
            + "\nL - Load Game"
            + "\nH - Help"
            + "\nE - Exit";
    
    void displayMenu() {
        
        char selection = ' ';
        do {
            
            //displays the MainMenu
            System.out.println(MENU);
            
            //get user's selection
            String input = this.getInput();
            //Get the first character of the string
            selection = input.charAt(0);
            
            //do action based on selection
            this.doAction(selection);
        }
        //an selection is not "Exit"
        while (selection != 'E');
    }

    //get input from user for desired Menu Item
    private String getInput() {
        //indicates if input has been retrieved
        boolean valid = false;
        String input = null;
        //keyboard input stream
        Scanner keyboard = new Scanner(System.in);
        
        //while a valid value has has not been retrieved
        while (!valid){
            //prompt for the player's input
            System.out.println("Enter menu selection below:");
            
            //get the input from the keyboard and trim of the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the input is invalid(may need help on this) - code is running to this point - when change to <2 code outputs invalid input
            if (input.length() < 1){
                System.out.println("Invalid input = input must not be blank");
                //and repeat again
                continue;
                
            }
            //exit the repetition
            break;   
        
        }
        //return the input
        return input;
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
    
}

