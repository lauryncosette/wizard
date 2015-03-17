
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;

//needs to be an enum?
public class Scene implements Serializable{
    
    //class instances
    private String description;
    private String mapSymbol;
    private boolean blocked;
    //do we need this?
    //private Location location; there can only be one scene at a location at a time
    //private Characters[] character;
    //private Clue clue;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Scene() {
    }
    
    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + "mapSymbol" + mapSymbol + "blocked" + blocked + '}';
    }
    
    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.mapSymbol);
        hash = 97 * hash + (this.blocked ? 1 : 0);
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
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.blocked != other.blocked) {
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

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setIcon(ImageIcon startingSceneImage) {
    }
}
