
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum NonphysicalInventory implements Serializable {
    
    Blood;
    
    private String ItemType;
    private String description;
    private String itemName;
    
    NonphysicalInventory() {
    }

    public String getItemType() {
        return ItemType;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        return itemName;
    }
}
