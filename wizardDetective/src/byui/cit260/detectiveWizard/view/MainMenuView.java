package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.exceptions.MapControlException;
import detectiveWizard.DetectiveWizard;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Main Menu                               |"
                + "\n-------------------------------------------"
                + "\nP - Play New Game"
                + "\nS - Save Game"
                + "\nL - Load Game"
                + "\nH - Help"
                + "\nE - Exit");
    }

    @Override
    public void doAction(String value) {

        switch (value.charAt(0)) {
            //create new game
            case 'P':
        {
            try {
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            //help menu
            case 'H':
                this.displayHelpMenu();
                break;
            //save game
            case 'S':
                this.saveGame();
                break;
            //load game
            case 'L':
                this.startExistingGame();
            //exit
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void startNewGame() throws MapControlException{
        //create new game
        GameControl.createNewGame(DetectiveWizard.getPlayer());
        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }
}
