/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import java.util.Scanner;

/**
*
* @author lauryn
*/
public class GameMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------"
            + "\nI | Investigate"
            + "\nV | View Score"
            + "\nM | Main Inventory Menu"
            + "\nE | Exit";
           
void displayMenu(){
    
    char selection = ' ';
    do {
        
        System.out.println(MENU);
        
        String input= this.getInput();
        
        selection = input.charAt(0);
        
        this.doAction(selection);
        
    }
    while (selection != 'E');
}

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
            
           
            if (input.length() < 1){
                System.out.println("\n***Invalid Selection *** Try again ");
                //and repeat again
                continue;
                
            }
            //exit the repetition
            break;   
        
        }

        return input;//return the name
                }

  
    private void doAction(char selection) {
        switch (selection){
            //open inventory
            case 'M':
                this.inventoryMenu();
                break;
            //exit
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }
    
    private void inventoryMenu(){
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.displayMenu();
    }
}
