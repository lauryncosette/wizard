/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lauryn
 */
public class NonphysicalInventory implements Serializable {
        
    private String ItemType;

    public NonphysicalInventory() {
    }

    @Override
    public String toString() {
        return "NonphysicalInventory{" + "ItemType=" + ItemType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.ItemType);
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
