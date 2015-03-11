package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public enum Characters implements Serializable {

    //roles, height, name
    Tim("He is your partner.", 6, "Tim"),
    Clyde("He is the janitor for the hotel.", 6, "Clyde"),
    Gaston("He is the matrede of the hotel.", 6, "Gaston"),
    Chief("Police chief.", 6, "Chief"),
    Jason("This bell boy is the one who found the body.", 6, "Jason"),
    Stevie("He is the victim of this crime.", 6, "Stevie"),;

    private final String role;
    private final double height;
    private final String name;
    //rumor is currently set up as a single array list.
    //We need to decide if we want to do a double array list String[number of questions][2] rumors.
    //We can remove the model layer class rumor and just put the array list above.
    //example
    //Tim(role, height, name, {{question 1, answer 1}{question 2, answer 2}}
    //private final String[] rumors; would need to be changed to private final String[][] rumors;
    //in constructor would need to add (String[][] rumors)
    //this.rumors = new String [number of questions][2];
    private final String[] rumors;

    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    Characters(String role, double height, String name) {
        this.role = role;
        this.height = height;
        this.name = name;
        //new string for every character
        this.rumors = new String[3];
    }

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
