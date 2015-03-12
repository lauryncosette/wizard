
package byui.cit260.detectiveWizard.view;

public class MapView extends View{
    
    public MapView(){
        super("\n----------------------------------------------------"
            + "\n|          |         |         |         |         |"
            + "\n|     D    |    C    |    E    |    9    |    P    |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|     8    |    7    |    6    |    5    |    S    |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|     4    |    3    |    2    |    1    |    R    |"
            + "\n|          |         |         |         |         |"
            + "\n|--------------------------------------------------|"
            + "\n|          |         |         |         |         |"
            + "\n|     W    |    Z    |    H    |    0    |    J    |"
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
            + "\nB - Banquet Hall               0 - Room 100"
            + "\nC - Crime Scene - Main         1 - Room 101"
            + "\nD - Crime Scene - Bathroom     2 - Room 102"
            + "\nE - Crime Scene - Bedroom      3 - Room 103"
            + "\nH - Main Hall                  4 - Room 104"
            + "\nI - Janitor's Closet           5 - Room 105"
            + "\nJ - Janitorial Office          6 - Room 106"
            + "\nK - Kitchen                    7 - Room 107"
            + "\nL - Lobby                      8 - Room 108"
            + "\nM - Manager Office             9 - Room 109"
            + "\nP - Pool"
            + "\nR - Laundry Room"
            + "\nS - Sauna"
            + "\nW - Wine Cellar"
            + "\nZ - Storage");
}

    @Override
    public void doAction(String value) {
        
        switch (value.charAt(0)) {
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }
    
}
