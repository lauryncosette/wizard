package byui.cit260.detectiveWizard.view;

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
                this.startNewGame();
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

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
        //Start new game function will create new player and will then call the game menu
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
