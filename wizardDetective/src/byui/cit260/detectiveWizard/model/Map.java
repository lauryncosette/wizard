
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public class Map implements Serializable{
    
    private Location[][] locations;
    
    public Location[][] getLocations(){
        return locations;
    }
    
    public void setLocation(Location[][] locations){
        this.locations = locations;
    }
    
    //show character location - array list - characters can be in one location at a time, but have the ability to move
    
    //show rooms - array list
}
