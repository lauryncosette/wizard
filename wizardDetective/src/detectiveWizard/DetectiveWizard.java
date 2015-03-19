
package detectiveWizard;

import byui.cit260.detectiveWizard.model.Player;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.view.StartProgramView;

public class DetectiveWizard {    
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DetectiveWizard.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DetectiveWizard.player = player;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create StartPRogramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.startProgram();
        } catch (throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    }
    
}
