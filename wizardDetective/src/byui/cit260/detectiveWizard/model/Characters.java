package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum Characters implements Serializable {

    //roles, height, name
    Tim("He is your partner.", 6),
    Clyde("He is the janitor for the hotel.", 6),
    Gaston("He is the matrede of the hotel.", 6),
    Chief("Police chief.", 6),
    Jason("This bell boy is the one who found the body.", 6),
    Stevie("He is the victim of this crime.", 6),;

    private final String role;
    private final double height;
    private final String[] rumors;
    //Do we need to have these
    //private final Game game;
    //private final String[] scenes; the character can be in multiple scenes

    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    Characters(String role, double height) {
        this.role = role;
        this.height = height;
        this.rumors = new String[3];
    }

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
