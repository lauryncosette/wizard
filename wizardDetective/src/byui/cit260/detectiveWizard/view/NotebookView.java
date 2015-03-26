package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.model.InventoryItem;
import byui.cit260.detectiveWizard.model.NonphysicalInventory;
import detectiveWizard.DetectiveWizard;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class NotebookView {

    protected final BufferedReader keyboard = DetectiveWizard.getInFile();
    protected final PrintWriter console = DetectiveWizard.getOutFile();

    //Code for displaying notebookMenu when not enough clues are accumilated
    private final String MENU = "\n"
            + "\n-------------------------------------------"
            + "\n| Notebook                                |"
            + "\n-------------------------------------------"
            + "\nV - View Inventory"
            + "\nD - Description of clue"
            + "\nE - Exit";

    //code for displaying notebook menu when enough clues are accumilated to end game
    private final String ENDMENU = "\n"
            + "\n-------------------------------------------"
            + "\n| Notebook                                |"
            + "\n-------------------------------------------"
            + "\nV - View Inventory"
            + "\nD - Description of clue"
            + "\nF - Finish Game"
            + "\nE - Exit";

    void displayMenu() {

        char selection = ' ';
        do {

            //display inventory list
            this.console.println("\n***List of items in notebook***");

            if (DetectiveWizard.getPlayer().getNumberOfClue() >= 7) {
                this.console.println(ENDMENU);
            } else {
                //displays the MainMenu
                this.console.println(MENU);
            }

            //get user's selection
            String input = this.getInput();
            //Get the first character of the string
            selection = input.charAt(0);

            //do action based on selection
            this.doAction(selection);
        } //an selection is not "Exit"
        while (selection != 'E');
    }

    public String getInput() {
        //indicates if input has been retrieved
        boolean valid = false;
        String input = null;

        try {
            //while a valid value has has not been retrieved
            while (!valid) {
                //prompt for the player's input
                this.console.println("Enter menu selection below:");

                //get the input from the keyboard and trim of the blanks
                input = this.keyboard.readLine();
                input = input.trim();

                //if the input is invalid(may need help on this) - code is running to this point - when change to <2 code outputs invalid input
                if (input.length() < 1) {
                    this.console.println("*** Invalid input *** input must not be blank");
                    //and repeat again
                    continue;

                }
                //exit the repetition
                break;

            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        //return the input
        return input;
    }

    private void description() {
        this.console.println("\n*** description function called ***");
    }

    private void finishGame() {
        this.console.println("\n***finishGame function called***");
    }

    public void doAction(char choice) {
        switch (choice) {
            //get item description
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
            //finish game
            case 'F':
                this.finishGame();
                break;
            case 'f':
                this.finishGame();
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

    private void viewInventory() {
        InventoryItem[] inventory = GameControl.getSortedInventoryList();

        this.console.println("\nList of Inventory Items");
        this.console.println("ItemName" + "\t"
                + "Description");

        for (InventoryItem inventoryItem : inventory) {
            if (inventoryItem instanceof NonphysicalInventory) {
                this.console.println(inventoryItem.getItemName() + "\t     "
                        + inventoryItem.getDescription() + "\t     ");
            }
        }
    }
}
