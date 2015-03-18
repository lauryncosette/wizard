
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.InventoryItem;
import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.Player;
import detectiveWizard.DetectiveWizard;

public class GameControl {
    
public static void createNewGame(Player player){
        
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

    public static InventoryItem[] createInventoryList() {
        
        //create inventory array(list)
        InventoryItem[] inventory = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem blood = new InventoryItem();
        blood.setItemName("blood splatter");
        blood.setDescription("blood found around victims body");
        //blood.setItemType("notebook - clue");
        inventory[Item.blood.ordinal()] = blood;
        
        InventoryItem hair = new InventoryItem();
        hair.setItemName("dark hair");
        hair.setDescription("lock of dark hair found in victims hand");
        //hair.setItemType("notebook - clue");
        inventory[Item.hair.ordinal()] = hair;
        
        InventoryItem pentagram = new InventoryItem();
        pentagram.setItemName("pentagram");
        pentagram.setDescription("pentagram inscribed on the floor around the body");
        //pentagram.setItemType("notebook - clue");
        inventory[Item.pentagram.ordinal()] = pentagram;
        
        InventoryItem key = new InventoryItem();
        key.setItemName("key");
        key.setDescription("key to one of the 'employee only' rooms");
        //key.setUse("opens door to wine cellar")
        inventory[Item.key.ordinal()] = key;
        
        InventoryItem murderWeapon = new InventoryItem();
        murderWeapon.setItemName("murder weapon");
        murderWeapon.setDescription("contains traces of victims blood but no fingerprints to help pinpoint the victim");
        //murderWeapon.setItemType("notebook - clue")
        inventory[Item.murderWeapon.ordinal()] = murderWeapon;
        
        InventoryItem caseFile = new InventoryItem();
        caseFile.setItemName("Past case file");
        caseFile.setDescription("previous case where victim was killed in an identical fashion, happened just down the street, exactly a year to the date");
        //caseFile.setItemType("notebook - clue")
        inventory[Item.caseFile.ordinal()] = caseFile;
        
        return inventory;
    }

    public static InventoryItem[] getSortedInventoryList() {
        
        //get inventory list for current game
        InventoryItem[] originalInventoryList = DetectiveWizard.getCurrentGame().getInventory();
        
        //clone original list
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1;i++){
            for (int j = 0; j < inventoryList.length-1-i; j++){
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j+1].getDescription())>0){
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }

    private static class Constants {
        private static int NUMBER_OF_INVENTORY_ITEMS;

        public Constants() { 
        }
    }
    
    public enum Item{
        blood,
        hair,
        pentagram,
        key,
        murderWeapon,
        caseFile;
    }
}
