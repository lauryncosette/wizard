
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public class Map implements Serializable{
    
    private Location[][] locations;
    //do we need this
    //private final Game game;

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Location[][] getLocations(){
        return locations;
    }
    
    public void setLocation(Location[][] locations){
        this.locations = locations;
    }
}
