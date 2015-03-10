package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

/**
 *
 * @author Cassandra
 */
public enum Characters implements Serializable {

    //roles
    Tim("He is your partner.", 6, "Tim"),
    Clyde("He is the janitor for the hotel.", 6, "Clyde"),
    Gaston("He is the matrede of the hotel.", 6, "Gaston"),
    Chief("Police chief.", 6, "Chief"),
    Jason("This bell boy is the one who found the body.", 6, "Jason"),
    Stevie("He is the victim of this crime.", 6, "Stevie"),;

    private final String role;
    private final double height;
    private final String name;
    private final String[] rumors;

    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    Characters(String role, double height, String name) {
        this.role = role;
        this.height = height;
        this.name = name;
        //new string for every character
        this.rumors = new String[3];
    }

    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", role=" + role + ", height=" + height + '}';
    }

    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate - not valid in enum
    public String getRole() {
        return role;
    }

    public Double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String[] getRumors() {
        return rumors;
    }
    
    
}
