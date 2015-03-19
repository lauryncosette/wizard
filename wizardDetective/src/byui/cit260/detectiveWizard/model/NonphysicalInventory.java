package byui.cit260.detectiveWizard.model;

import java.util.Objects;

public class NonphysicalInventory extends InventoryItem {

    private String ItemType;

    public NonphysicalInventory() {
    }

    @Override
    public String toString() {
        return "NonphysicalInventory{" + "ItemType=" + ItemType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ItemType);
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
        final NonphysicalInventory other = (NonphysicalInventory) obj;
        if (!Objects.equals(this.ItemType, other.ItemType)) {
            return false;
        }
        return true;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }
}
