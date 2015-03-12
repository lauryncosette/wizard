
package byui.cit260.detectiveWizard.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable{
    
    //class instances
    private Point coordinate;
    private Clue clue; //the clue is actually associated with the scene.  Do we need to remove it then?
    //do we need to have these?
    //private Characters[] character;
    //private Scene scene; there is only one scene at a location
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" + "coordinate=" + coordinate + ", clue=" + clue + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.coordinate);
        hash = 37 * hash + Objects.hashCode(this.clue);
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
        if (!Objects.equals(this.clue, other.clue)) {
            return false;
        }
        return true;
    }
    
    public Point getCoordinate(){
        return coordinate;
    }

    public Clue getClue() {
        return clue;
    }

    public void setCoordinate(Point coordinate) {
        this.coordinate = coordinate;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }
    
}
