/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.ViewInterface;

/**
 *
 * @author Cassandra
 */
public abstract class View implements ViewInterface{
    
    
    private String promptMessage;
    
    @Override
    public void display() {
        
        String value;
        //char selection = ' '; is replaced with value
        do {
            
            //displays the MainMenu
            System.out.println(this.promptMessage);
            
            //get user's selection
            value = this.getInput();
            //Get the first character of the string
            //selection = input.charAt(0);
            
            //do action based on selection
            this.doAction(value);
        }
        //an selection is not "Exit"
        while (!value.equals("E"));
    }
}
