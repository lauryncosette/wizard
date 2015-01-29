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
 * @author Cassandra/Lauryn
 */
//extends (inheritance) Inventory (parent class)
public class PhysicalInventory /*extends Inventory*/ implements Serializable{
    
    //class instance variables
    private String use;

    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public PhysicalInventory() {
    }
    
    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "PhysicalInventory{" + "use=" + use + '}';
    }

    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.use);
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
    
    //void needs to be lowercased - solves problem with needing a return
    public void setUse(String use){
        this.use=use;
    }
}
