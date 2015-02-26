/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import detectiveWizard.DetectiveWizard;
import java.util.Scanner;

/**
 *
 * @author Mathew
 */
public class NotebookView {
    
    //Code for displaying notebookMenu when not enough clues are accumilated
    private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n| Notebook                        |"
            + "\n-----------------------------------"
            + "\nD - Description of clue"
            + "\nE - Exit";
    
    //code for displaying notebook menu when enough clues are accumilated to end game
    private final String ENDMENU = "\n"
            + "\n-----------------------------------"
            + "\n| Notebook                        |"
            + "\n-----------------------------------"
            + "\nD - Description of clue"
            + "\nF - Finish Game"
            + "\nE - Exit";
    
    void displayMenu() {
        
        char selection = ' ';
        do {
            
            //display inventory list
            System.out.println("***List of items in notebook***");
            
            if(DetectiveWizard.getPlayer().getNumberOfClue() >=7){
                System.out.println(ENDMENU);
            }
            
            else{
            //displays the MainMenu
            System.out.println(MENU);
            }
            
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
            //get item description
            case 'D':
                this.description();
                break;
            //finish game
            case 'F':
                this.finishGame();
                break;
            //exit
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void description() {
        System.out.println("*** description function called ***");
    }

    private void finishGame() {
        System.out.println("***finishGame function called***");
    }
    
}
