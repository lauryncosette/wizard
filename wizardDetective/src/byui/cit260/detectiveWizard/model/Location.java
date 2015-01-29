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
public class Location implements Serializable{
    
    //class instances
    private String coordinate;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Location() {
    }
    
    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "Location{" + "coordinate=" + coordinate + '}';
    }
    
    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.coordinate);
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.coordinate, other.coordinate)) {
            return false;
        }
        return true;
    }
    
    public String getCoordinate(){
        return coordinate;
    }
    
    public void setCoordinate(String coordinate){
        this.coordinate = coordinate;
    }
}
