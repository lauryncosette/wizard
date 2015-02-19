/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Player;
import detectiveWizard.DetectiveWizard;

/**
 *
 * @author Cassandra
 */
public class ProgramControl {
    
    //will correct createPlayer - currently focused on view layer
    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        //save the player
        DetectiveWizard.setPlayer(player);
        
        return player;
    }
    
}
