package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum Characters implements Serializable {

    //enum list
    Tim("He is your partner.", 6),
    Clyde("He is the janitor for the hotel.", 6),
    Gaston("He is the matrede of the hotel.", 6.7),
    Chief("Police chief.", 6),
    Jason("This bell boy is the one who found the body.", 6),
    Stevie("He is the victim of this crime.", 6),
    Waitress("Works in the dinning room.", 6),
    Maid("Cleans the guest rooms.", 6),
    Cook("Works the dinner shift and begins perparations for breakfast.", 6),
    Guest("Staying at the hotel.  Doesn't know about the murder.", 6);

    //class instances
    private final String role;
    private final double height;
    //class relations
    private final String[] rumors; //this needs to be changed to an array or array list
    //Do we need to have these
    //private final Game game;
    //private final String[] scenes; is this to be an array or array list

    //constructor
    Characters(String role, double height) {
        this.role = role;
        this.height = height;
        this.rumors = new String[3];
    }

    //getter
    public String getRole() {
        return role;
    }

    public Double getHeight() {
        return height;
    }

    public String[] getRumors() {
        return rumors;
    }
    //Do we need to have these
    //public Game getGame(){
    //  return game;
    //}

    //public String[] getScenes(){
    //  return scenes;
    //}
}
