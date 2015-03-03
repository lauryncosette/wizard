/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard;

/**
 *
 * @author Cassandra
 */
public interface ViewInterface {
    
    //function signatures that all viewlayer classes will implement
    public void display();
    public String getInput();
    public void doAction(String Value);
}
