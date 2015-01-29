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
public class Character implements Serializable{
    
    //class instance
    private String name;
    private String role;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Character() {
    }
    
    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", role=" + role + '}';
    }
    
    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.role);
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
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        return true;
    }
    
    public String getName(){
        return name;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setRole(String role){
        this.role = role;
    }
}
