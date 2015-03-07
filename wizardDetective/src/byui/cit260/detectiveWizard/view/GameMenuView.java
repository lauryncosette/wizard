package byui.cit260.detectiveWizard.view;

/**
 *
 * @author lauryn
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Game Menu                               |"
                + "\n-------------------------------------------"
                + "\nI | Investigate"
                + "\nV | View Score"
                + "\nM | Main Inventory Menu"
                + "\nE | Exit");
    }

    @Override
    public void doAction(String value) {
        switch (value.charAt(0)) {
            //open inventory
            case 'M':
                this.inventoryMenu();
                break;
            //exit
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }
    
    private void inventoryMenu() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }
}
