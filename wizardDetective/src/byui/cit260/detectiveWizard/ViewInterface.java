package byui.cit260.detectiveWizard;

public interface ViewInterface {

    //function signatures that all viewlayer classes will implement
    public void display();

    public String getInput();

    public void doAction(String Value);
}
