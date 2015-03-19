package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.model.InventoryItem;

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
            case 'D':
                this.description();
                break;
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void description() {
        System.out.println("*** description function called ***");
    }

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        System.out.println("\nList of Inventory Items");
        System.out.println("ItemName" + "\t"
                + "Description");

        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getItemName() + "\t     "
                    + inventoryItem.getDescription() + "\t     ");
        }
    }

}
