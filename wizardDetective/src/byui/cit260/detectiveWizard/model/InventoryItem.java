
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Objects;

public class InventoryItem implements Serializable{
    
    private String description;
    private String itemName;

    public InventoryItem() {
    }

    @Override
    public String toString() {
        return "InventoryItems{" + "description=" + description + ", itemName=" + itemName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + Objects.hashCode(this.itemName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }   
}