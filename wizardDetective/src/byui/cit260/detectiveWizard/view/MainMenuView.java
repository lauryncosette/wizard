package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.GameControl;
import byui.cit260.detectiveWizard.exceptions.MapControlException;
import detectiveWizard.DetectiveWizard;

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
            case 'P': {
                try {
                    this.startNewGame();
                } catch (MapControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
            }
            break;
            case 'p': {
                try {
                    this.startNewGame();
                } catch (MapControlException ex) {
                    ErrorView.display(this.getClass().getName(), ex.getMessage());
                }
            }
            break;
            //help menu
            case 'H':
                this.displayHelpMenu();
                break;
            case 'h':
                this.displayHelpMenu();
                break;
            //save game
            case 'S':
                this.saveGame();
                break;
            case 's':
                this.saveGame();
                break;
            //load game
            case 'L':
                this.startExistingGame();
                break;
            case 'l':
                this.startExistingGame();
                break;
            //exit
            case 'E':
                break;
            case 'e':
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
    }

    private void startNewGame() throws MapControlException {
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
        this.console.println("\n\nEnter the file path for file where the game is to be saved.");
        
        String filePath = this.getInput();
        
        try{
            GameControl.saveGame(DetectiveWizard.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
    }

    private void startExistingGame() {
        this.console.println("*** startExistingGame function called ***");
    }
}
