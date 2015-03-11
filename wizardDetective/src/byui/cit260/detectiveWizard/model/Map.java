
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public class Map implements Serializable{
    
    private Location[] location;
    
    public Location[] getLocation(){
        return location;
    }
    
    public void setLocation(Location[] location){
        this.location = location;
    }
    
    //show character location - array list - characters can be in one location at a time, but have the ability to move
    
    //show rooms - array list
}
