
package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.ViewInterface;
import java.util.Scanner;
import static java.lang.Character.toUpperCase;

public abstract class View implements ViewInterface{
    
    
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
        
        String value;
        //char value = ' ';is replaced with value
        do {
            
            //displays the MainMenu
            System.out.println(this.promptMessage);
            
            //get user's selection
            value = this.getInput();
            
            //do action based on selection
            this.doAction(value);
        }
        //an selection is not "Exit"
        while (!value.equals("E"));
    }
    
    @Override
    public String getInput() {
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
                System.out.println("*** Invalid input *** input must not be blank");
                //and repeat again
                continue;
                
            }
            //exit the repetition
            break;   
        
        }
        //return the input
        return input;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
}
