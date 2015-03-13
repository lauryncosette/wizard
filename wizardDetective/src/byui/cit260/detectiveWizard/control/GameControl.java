
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.InventoryItem;
import byui.cit260.detectiveWizard.model.Map;
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
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventoryItem(inventoryList);
        
        //create and initialize new map
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

    private static InventoryItem[] createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
