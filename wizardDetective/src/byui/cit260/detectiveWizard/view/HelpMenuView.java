/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import java.util.Scanner;

/**
 *
 * @author Cassandra
 */
public class HelpMenuView {
    
  //Code for displaying HelpMenu
    private final String MENU = "\n"
            + "\n-------------------------------------------"
            + "\n| Help Menu                               |"
            + "\n-------------------------------------------"
            + "\nM - How to move around the map"
            + "\nC - Controls, how the game works"
            + "\nI - How to investigate a room"
            + "\nE - Exit";
    
void displayMenu() {
        
        char selection = ' ';
        do {
            
            //displays the HelpMenu
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
            case 'M':
                this.howToMove();
                break;
            //help menu
            case 'C':
                this.control();
                break;
            //save game
            case 'I':
                this.investigateRoom();
                break;
            //exit
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void howToMove() {
        System.out.println("How to move your character from one location to another.");
    }

    private void control() {
        System.out.println("How to look in your inventory."
                + "\nHow to use an inventory item."
                + "\nHow to view the map."
                + "\nHow to use magical abilities.");
    }

    private void investigateRoom() {
        System.out.println("How to investigate different items in a room.");
    }
}
