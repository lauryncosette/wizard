
package byui.cit260.detectiveWizard.view;

public class BackpackView extends View{
    
    public BackpackView(){
        super("\n"
            + "\n-------------------------------------------"
            + "\n| Backpack                                |"
            + "\n-------------------------------------------"
            + "\nD - Description of clue"
            + "\nE - Exit");
    }

    @Override
    public void doAction(String value) {
        
        switch (value.charAt(0)){
            case'D':
                this.description();
                break;
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void description() {
        System.out.println("*** description function called ***");
    }
    
}
