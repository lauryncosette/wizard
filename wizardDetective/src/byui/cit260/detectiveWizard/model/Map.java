
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public class Map implements Serializable{
    
    private Location[][] locations;
    //do we need this
    //private final Game game;
    
    public Location[][] getLocations(){
        return locations;
    }
    
    public void setLocation(Location[][] locations){
        this.locations = locations;
    }
}
