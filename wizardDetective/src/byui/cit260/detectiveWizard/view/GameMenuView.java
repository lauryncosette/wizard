package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.MapControl;
import byui.cit260.detectiveWizard.model.Character;
import byui.cit260.detectiveWizard.exceptions.MapControlException;
import java.awt.Point;

/**
 *
 * @author lauryn
 */
public class GameMenuView extends View {

    private Point coordinates;

    public GameMenuView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Game Menu                               |"
                + "\n-------------------------------------------"
                + "\nI | Investigate"
                + "\nV | View Score"
                + "\nM | Main Inventory Menu"
                + "\nN | View Map"
                + "\nT | Travel to new location"
                + "\nE | Exit");
    }

    @Override
    public void doAction(String value) {
        Character character = null;

        switch (value.charAt(0)) {

            case 'I':
                this.investigate();
                break;
            case 'i':
                this.investigate();
                break;
            case 'V':
                this.viewScore();
                break;
            case 'v':
                this.viewScore();
                break;
            case 'M':
                this.inventoryMenu();
                break;
            case 'm':
                this.inventoryMenu();
                break;
            case 'N':
                this.displayMap();
                break;
            case 'n':
                this.displayMap();
                break;
            case 'T':
                try {
                    this.travelNewLocation();
                    MapControl.moveActorsToLocation(character, coordinates);
                } catch (MapControlException me) {
                    ErrorView.display(this.getClass().getName(), me.getMessage());
                }
                break;
            case 't':
                try {
                    this.travelNewLocation();
                    MapControl.moveActorsToLocation(character, coordinates);
                } catch (MapControlException me) {
                    ErrorView.display(this.getClass().getName(), me.getMessage());
                }
                break;
            //exit
            case 'E':
                break;
            case 'e':
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
    }

    private void inventoryMenu() {
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

    private void investigate() {
        this.console.println("Allows you to investigate objects in a room");
    }

    private void viewScore() {
        this.console.println("Show list of top scores");
    }

    private void displayMap() {
        this.console.println("Shows map");
    }

    private void travelNewLocation() {
        this.console.println("Travel to new location");
    }
}
