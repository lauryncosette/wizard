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
                + "\nN | View Map"
                + "\nE | Exit");
    }

    @Override
    public void doAction(String value) {
        switch (value.charAt(0)) {
            
            case 'I':
                this.investigate();
                break;
            case 'V':
                this.viewScore();
                break;
            //open inventory
            case 'M':
                this.inventoryMenu();
                break;
            case 'N':
                this.viewMap();
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

    private void investigate() {
        System.out.println("Allows you to investigate objects in a room");
    }

    private void viewScore() {
        System.out.println("Show list of top scores");
    }

    private void viewMap() {
        MapView map = new MapView();
        map.display();
    }
}
