package byui.cit260.detectiveWizard.model;

import java.util.Objects;

public class PhysicalInventory extends InventoryItem {

    private String use;

    public PhysicalInventory() {
    }

    @Override
    public String toString() {
        return "PhysicalInventory{" + "use=" + use + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.use);
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
        final PhysicalInventory other = (PhysicalInventory) obj;
        if (!Objects.equals(this.use, other.use)) {
            return false;
        }
        return true;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }
}
