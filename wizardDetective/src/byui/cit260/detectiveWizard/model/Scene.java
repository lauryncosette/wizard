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
 * @author Cassandra
 */
public class Scene implements Serializable{
    
    //class instances
    private String description;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Scene() {
    }
    
    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + '}';
    }
    
    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.description);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
}
