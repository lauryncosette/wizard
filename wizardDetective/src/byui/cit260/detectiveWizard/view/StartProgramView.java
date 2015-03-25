package byui.cit260.detectiveWizard.view;

import byui.cit260.detectiveWizard.control.ProgramControl;
import byui.cit260.detectiveWizard.model.Player;
import java.util.Scanner;

public class StartProgramView {

    public void startProgram() {

        //Display the banner screen - tested/passed
        this.displayBanner();

        //prompt the player to enter their name, retrieve the name of the player - tested/passed
        String playersName = this.getPlayersName();

        //create and save the player object - tested/passed
        Player player = ProgramControl.createPlayer(playersName);

        //display a personalized welcome message
        this.displayWelcomeMessage(player);

        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void displayBanner() {
        System.out.println("\n\n*******************************************");
        System.out.println("*                                         *"
                + "\n* This is the game of Wizard Detective.   *"
                + "\n* In this game you are a detective by day *"
                + "\n* and a wizard by night.  One night you   *"
                + "\n* were called into work to investigate a  *"
                + "\n* murder.  The poor victim is a local     *"
                + "\n* rich boy who was staying at the best    *"
                + "\n* hotel in town.  The bellboy was the one *"
                + "\n* who found the body.                     *");
        System.out.println("*                                         *"
                + "\n* Frustratingly, there were no witnesses, *"
                + "\n* but the night staff at the hotel has    *"
                + "\n* been asked to stay for you to question. *"
                + "\n* The chief would like to keep this quiet *"
                + "\n* until the morning so the other visitors *"
                + "\n* at the hotel have been kept in the      *"
                + "\n* dark.  The hotel's exits are being      *"
                + "\n* watched - no one has entered or left    *"
                + "\n* the building.  It is up to you and your *"
                + "\n* partner, Tim, to find the killer.       *");
        System.out.println("*                                         *"
                + "\n* You must be able to search each room to *"
                + "\n* find clues without arousing the         *"
                + "\n* suspicion of the killer or any of the   *"
                + "\n* other guests.  Witnesses will be        *"
                + "\n* waiting in each room for you to talk to *"
                + "\n* and to gain information from.           *"
                + "\n*                                         *"
                + "\n*******************************************");
    }

    public String getPlayersName() {

        //indicates if the name has been retrieved
        boolean valid = false;
        String playersName = null;

        try {
        //while a valid name has not been retrieved
        while (!valid) {

            //prompt for the player's name
            System.out.println("Enter the player's name below:");

            //get the name from the keyboard and trim of the blanks
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();

            //if the name is invalid (less than two character in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name = the name must not be blank");
                //and repeat again
                continue;
            }
            //exit the repetition
            break;
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        //return the name
        return playersName;
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n============================================");
        System.out.println("\tWelcome to the game " + player.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("============================================");
    }
}
