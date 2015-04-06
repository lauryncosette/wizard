package byui.cit260.detectiveWizard.view;

public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Help Menu                               |"
                + "\n-------------------------------------------"
                + "\nM - How to move around the map"
                + "\nC - Controls, how the game works"
                + "\nI - How to investigate a room"
                + "\nE - Exit");
    }

    @Override
    public void doAction(String value) {

        switch (value.charAt(0)) {
            case 'M':
                this.howToMove();
                break;
            case 'm':
                this.howToMove();
                break;
            case 'C':
                this.control();
                break;
            case 'c':
                this.control();
                break;
            case 'I':
                this.investigateRoom();
                break;
            case 'i':
                this.investigateRoom();
                break;
            case 'E':
                break;
            case 'e':
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
    }

    private void howToMove() {
        this.console.println("To travel to a new location open the Game Menu and select 'Travel to New Location.' Once that is open"
                + "type in the coordinates of the location that you want to travel to 'x' and 'y.'");
    }

    private void control() {
        this.console.println("Open up the Game Menu and select 'Inventory Menu for a list of your inventory items!"
                + "\nOpen up the Backpack from the Inventory Menu and select on the item that you wish to use."
                + "\nOpen up the Game Menu to view the Map by selecting 'Display Map."
                + "\nHow to use magical abilities.");
    }

    private void investigateRoom() {
        this.console.println("How to investigate different items in a room.");
    }
}
