
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum PhysicalInventory implements Serializable{
    
    key;
    
    private String use;
    private String description;
    private String itemName;

    PhysicalInventory() {
    }

    public String getUse() {
        return use;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        return itemName;
    }
    
    
}