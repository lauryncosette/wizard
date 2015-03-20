package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

//needs to be an enum?
public class Location implements Serializable {

    //class instances
    private int row;
    private int column;
    private Clue clue; //the clue is actually associated with the scene.  Do we need to remove it then?
    private boolean visited;
    private Scene scene;
    private Character[] characters;
    //do we need to have these?
    //private Character[] character;
    //private Scene scene; there is only one scene at a location

    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Location() {
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.column;
        hash = 97 * hash + (this.visited ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Clue getClue() {
        return clue;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }
}
