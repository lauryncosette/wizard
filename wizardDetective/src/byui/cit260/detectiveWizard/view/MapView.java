
package byui.cit260.detectiveWizard.view;

public class MapView extends View{
    
    public MapView(){
        super("\n----------------------------------------------------"
            + "\n|          |         |         |         |         |"
            + "\n|     D    |    C    |    E    |         |         |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|          |         |         |         |         |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|          |         |         |         |    R    |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|     W    |         |         |         |    J    |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|     K    |    B    |    L    |    M    |    I    |"
            + "\n|          |         |         |         |         |"
            + "\n----------------------------------------------------"
            + "\n"
            + "\n----------------------------------------------------"
            + "\n| Map Options                                      |"
            + "\n----------------------------------------------------"
            + "\nB - Banquet Hall"
            + "\nC - Crime Scene - Presidential Suite"
            + "\nD - Presidential Suite - Bathroom"
            + "\nE - Presidential Suite - Bedroom"
            //+ "\nG - Guest Room 100s"
            + "\nI - Janitor's Closet"
            + "\nJ - Janitorial Office"
            + "\nK - Kitchen"
            + "\nL - Lobby"
            + "\nM - Manager Office"
            + "\nR - Laundry Room"
            + "\nW - Wine Cellar");
}

    @Override
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
