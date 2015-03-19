package byui.cit260.detectiveWizard.view;

public class InventoryMenuView extends View {

    public InventoryMenuView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Inventory Menu                          |"
                + "\n-------------------------------------------"
                + "\nB - View Backpack"
                + "\nN - View Notebook"
                + "\nE - Exit");
    }

    @Override
    public void doAction(String value) {

        switch (value.charAt(0)) {
            case 'B':
                this.viewBackpack();
                break;
            case 'N':
                this.viewNotebook();
                break;
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void viewBackpack() {
        BackpackView backpack = new BackpackView();
        backpack.display();
    }

    private void viewNotebook() {
        NotebookView notebook = new NotebookView();
        notebook.displayMenu();
    }

}
