package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Player;
import detectiveWizard.DetectiveWizard;

public class ProgramControl {

    //will correct createPlayer - currently focused on view layer
    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        //save the player
        DetectiveWizard.setPlayer(player);

        return player;
    }

}
