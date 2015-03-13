
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.PhysicalInventory;
import byui.cit260.detectiveWizard.model.NonphysicalInventory;
import byui.cit260.detectiveWizard.model.Player;
import detectiveWizard.DetectiveWizard;

public class GameControl {
    
    public static void createNewGame(Player player) throws MapControl.MapControlException{
        
        //create new game
        Game game = new Game();
        //save in DetectiveWizard
        DetectiveWizard.setCurrentGame(game);
        
        //save player
        game.setPlayer(player);
        
        //create inventory list and save
        PhysicalInventory[] physicalInventoryList = GameControl.createPhysicalInventoryList();
        game.setPhysicalInventory(physicalInventoryList);
        
        NonphysicalInventory[] nonphysicalInventoryList = GameControl.createNonpysicalInventoryList();
        game.setNonpysicalInventoryList(nonphysicalInventoryList);
        
        //create and initialize new map
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

    public static PhysicalInventory[] createPhysicalInventoryList() {
        
        System.out.println("*** called createPhysicalInventoryList() in GameControl ***");
        return null;
    }

    public static NonphysicalInventory[] createNonpysicalInventoryList() {
        System.out.println("*** called createNonphysicalInventoryList() in GameControl ***");
        return null;
    }
}
