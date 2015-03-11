
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author lauryn
 */
public class Clue implements Serializable{
  
    // class instance variables
    private String itemType;
    private String itemName;
    private String itemDescription;

    public Clue() {
    }

    @Override
    public String toString() {
        return "Clue{" + "itemType=" + itemType + ", itemName=" + itemName + ", itemDescription=" + itemDescription + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.itemType);
        hash = 67 * hash + Objects.hashCode(this.itemName);
        hash = 67 * hash + Objects.hashCode(this.itemDescription);
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
        final Clue other = (Clue) obj;
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        return true;
    }

    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    
    

}