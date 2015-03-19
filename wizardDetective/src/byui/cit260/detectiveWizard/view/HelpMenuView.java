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
            case 'C':
                this.control();
                break;
            case 'I':
                this.investigateRoom();
                break;
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void howToMove() {
        System.out.println("How to move your character from one location to another.");
    }

    private void control() {
        System.out.println("How to look at your inventory."
                + "\nHow to use an inventory item."
                + "\nHow to view the map."
                + "\nHow to use magical abilities.");
    }

    private void investigateRoom() {
        System.out.println("How to investigate different items in a room.");
    }
}
