package detectiveWizard;

import byui.cit260.detectiveWizard.model.Player;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DetectiveWizard {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

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
            DetectiveWizard.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            //does this system.in need to be removed or changed for the BufferedReader???

            DetectiveWizard.outFile = new PrintWriter(System.out, true);
            //does this system.out need to be changed to this.console???

            String filePath = "log.txt";
            DetectiveWizard.logFile = new PrintWriter(filePath);

        } catch (Exception e) {
            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

        } finally {
            try {
                if (DetectiveWizard.inFile != null) {
                    DetectiveWizard.inFile.close();
                }
                if (DetectiveWizard.outFile != null) {
                    DetectiveWizard.outFile.close();
                }
                if (DetectiveWizard.logFile != null) {
                    DetectiveWizard.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("*** Error closing files ***");
                return;
            }
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

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        DetectiveWizard.logFile = logFile;
    }
}
