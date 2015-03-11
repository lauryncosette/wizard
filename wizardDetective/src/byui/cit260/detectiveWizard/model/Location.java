
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum Location implements Serializable{
    
    Kitchen(),
    CrimeScene(),
    Bathroom(),
    Bedroom(),
    Lobby(),
    JanitorOffice(),
    JanitorCloset(),
    WineCellar(),
    BanquetHall(),
    LaundryRoom(),
    GuestRoomEmpty(),
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
