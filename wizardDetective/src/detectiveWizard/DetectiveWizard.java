/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detectiveWizard;

//for each program you need to be sure to import it from the java file to this file because this is the only file that is read
import byui.cit260.detectiveWizard.model.EndUser;
import byui.cit260.detectiveWizard.model.Character;
import byui.cit260.detectiveWizard.model.Clue;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.InventoryItems;
import byui.cit260.detectiveWizard.model.Location;
import byui.cit260.detectiveWizard.model.Scene;

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
        
        //Test run Character
        Character characterOne = new Character();
        
        characterOne.setName("Tedd Williams");
        characterOne.setRole("Killer");
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        //Test run Location
        Location roomOne = new Location();
        
        roomOne.setCoordinate("Lobby");
        
        String roomInfo = roomOne.toString();
        System.out.println(roomInfo);
        
        //Test run Scene
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Blood pooled around the body with footprints leading off down the hall.");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        //Test run Game
        Game gameOne = new Game();
        
        gameOne.setScore(17);
        System.out.println(gameOne.toString());
        
       //Test run Clue
        Clue clueOne = new Clue();
        
        clueOne.setItemType("Poster");
        clueOne.setItemName("Famous Band");
        clueOne.setItemDescription("Information about Suspect");
        
        String clueInfo = clueOne.toString();
        System.out.println(clueInfo);
        
        // Test run InventoryItems
        
        InventoryItems inventoryItemsOne = new InventoryItems();
        
        inventoryItemsOne.setDescription("Bloody");
        inventoryItemsOne.setItemName("Candle Stick");
        
    }
    
}
