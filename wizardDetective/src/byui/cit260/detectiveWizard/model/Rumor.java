/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author lauryn
 */
public class Rumor implements Serializable {

    //because some rumors/clues are associated with the character - should there be some clues written in for the character?
    
    //need to come up with a list of rumors/verbal clues to help the play along
    //these rumors would be an array
    
    //each clue would be associated with a question
    
    //What do you think about Stevie?
    //Jason - He at least tips very well.
    //Clyde - Very messy kid.  I'm always having to clean up after him and his parties.
    //Chief - There have been complaints and call-ins from the other hotel guests.
    //Gaston - He's an okay kid.  He comes here often.

    private String description;

    public Rumor() {
    }

    @Override
    public String toString() {
        return "Rumor{" + "description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rumor other = (Rumor) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
