
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum Location implements Serializable{
    
    Kitchen(),
    CrimeScene(),
    MainLobby(),
    JanitorialOffice(),
    JanitorCloset(),
    WineCellar(),
    BanquetHall(),
    LaundryRoom(),
    Elevator(),
    GuestRoomEmpty(),
    Lounge(),
    ManagerOffice();
    
    //class instances
    private String coordinate;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    Location() {
    }
    
    public String getCoordinate(){
        return coordinate;
    }
    
    public void setCoordinate(String coordinate){
        this.coordinate = coordinate;
    }
}
