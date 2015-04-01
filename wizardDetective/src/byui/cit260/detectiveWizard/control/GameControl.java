package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.exceptions.GameControlException;
import byui.cit260.detectiveWizard.exceptions.MapControlException;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.InventoryItem;
import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.NonphysicalInventory;
import byui.cit260.detectiveWizard.model.PhysicalInventory;
import byui.cit260.detectiveWizard.model.Player;
import detectiveWizard.DetectiveWizard;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {

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

        NonphysicalInventory blood = new NonphysicalInventory();
        blood.setItemName("blood splatter");
        blood.setDescription("blood found around victims body");
        blood.setItemType("notebook - clue");
        inventory[Item.blood.ordinal()] = blood;

        NonphysicalInventory hair = new NonphysicalInventory();
        hair.setItemName("dark hair");
        hair.setDescription("lock of dark hair found in victims hand");
        hair.setItemType("notebook - clue");
        inventory[Item.hair.ordinal()] = hair;

        NonphysicalInventory pentagram = new NonphysicalInventory();
        pentagram.setItemName("pentagram");
        pentagram.setDescription("pentagram inscribed on the floor around the body");
        pentagram.setItemType("notebook - clue");
        inventory[Item.pentagram.ordinal()] = pentagram;

        PhysicalInventory key = new PhysicalInventory();
        key.setItemName("key");
        key.setDescription("key to one of the 'employee only' rooms");
        key.setUse("backpack - opens door to wine cellar");
        inventory[Item.key.ordinal()] = key;

        NonphysicalInventory murderWeapon = new NonphysicalInventory();
        murderWeapon.setItemName("murder weapon");
        murderWeapon.setDescription("contains traces of victims blood but no fingerprints to help pinpoint the victim");
        murderWeapon.setItemType("notebook - clue");
        inventory[Item.murderWeapon.ordinal()] = murderWeapon;

        NonphysicalInventory caseFile = new NonphysicalInventory();
        caseFile.setItemName("Past case file");
        caseFile.setDescription("previous case where victim was killed in an identical fashion, happened just down the street, exactly a year to the date");
        caseFile.setItemType("notebook - clue");
        inventory[Item.caseFile.ordinal()] = caseFile;

        return inventory;
    }

    public static InventoryItem[] getSortedInventoryList() {

        //get inventory list for current game
        InventoryItem[] originalInventoryList = DetectiveWizard.getCurrentGame().getInventory();

        //clone original list
        InventoryItem[] inventoryList = originalInventoryList.clone();

        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }

    //because we used an IOException we needed to create an import. Do we need to put the IOException in the GameControlException class?
    public static void saveGame(Game currentGame, String filePath) throws GameControlException, IOException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            Game game = null;
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        DetectiveWizard.setCurrentGame(game);
    }

    private static class Constants {

        private static int NUMBER_OF_INVENTORY_ITEMS = 6;

        public Constants() {
        }
    }

    public enum Item {

        blood,
        hair,
        pentagram,
        key,
        murderWeapon,
        caseFile;
    }
}
