/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectiveWizard;

//for each program you need to be sure to import it from the java file to this file because this is the only file that is read
import byui.cit260.detectiveWizard.model.EndUser;

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
