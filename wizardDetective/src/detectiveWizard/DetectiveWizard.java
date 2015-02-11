/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectiveWizard;

//for each program you need to be sure to import it from the java file to this file because this is the only file that is read
//Model layer imports
import byui.cit260.detectiveWizard.model.EndUser;
import byui.cit260.detectiveWizard.model.Character;
import byui.cit260.detectiveWizard.model.Clue;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.InventoryItems;
import byui.cit260.detectiveWizard.model.Location;
import byui.cit260.detectiveWizard.model.NonphysicalInventory;
import byui.cit260.detectiveWizard.model.Rumor;
import byui.cit260.detectiveWizard.model.Scene;
import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.PhysicalInventory;

//Control layer imports
import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.control.PlayerControl;
import byui.cit260.detectiveWizard.control.ProgramControl;

/**
 *
 * @author Cassandra/Lauryn
 */
public class DetectiveWizard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test run EndUser
      EndUser playerOne = new EndUser();
        
        playerOne.setName("Cassandra Van Lydegraf");
        playerOne.setRole("Famous wizard detective");
        playerOne.setScore(17);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
