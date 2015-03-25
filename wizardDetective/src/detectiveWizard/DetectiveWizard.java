
package detectiveWizard;

import byui.cit260.detectiveWizard.model.Player;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.view.StartProgramView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DetectiveWizard {    
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

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
        
        try {
            DetectiveWizard.inFile = 
                    new BufferedReader (new InputStreamReader(System.in));
            
            DetectiveWizard.outFile = new PrintWriter(System.out, true);
        }
        catch (Exception e){
            
        }
        //create StartPRogramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayBanner();
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        DetectiveWizard.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        DetectiveWizard.inFile = inFile;
    }
}
