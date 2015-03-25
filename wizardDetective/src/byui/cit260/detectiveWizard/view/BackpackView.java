package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.model.InventoryItem;
import byui.cit260.detectiveWizard.model.PhysicalInventory;

public class BackpackView extends View {

    public BackpackView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Backpack                                |"
                + "\n-------------------------------------------"
                + "\nV - View Inventory"
                + "\nD - Description of clue"
                + "\nE - Exit");
    }

    @Override
    public void doAction(String value) {

        switch (value.charAt(0)) {
            case 'V':
                this.viewInventory();
                break;
            case 'v':
                this.viewInventory();
                break;
            case 'D':
                this.description();
                break;
            case 'd':
                this.description();
                break;
            case 'E':
                break;
            case 'e' :
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
    }

    private void description() {
        this.console.println("*** description function called ***");
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        this.console.println("\nList of Inventory Items");
        this.console.println("ItemName" + "\t"
                + "Description");

        for (InventoryItem inventoryItem : inventory) {
            if (inventoryItem instanceof PhysicalInventory) {
                this.console.println(inventoryItem.getItemName() + "\t     "
                        + inventoryItem.getDescription() + "\t     ");
            }
        }
    }

}
