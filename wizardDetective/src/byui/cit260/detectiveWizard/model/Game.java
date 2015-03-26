package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Game implements Serializable {

    //class instance variables
    private int score;
    private Date date;
    //class relations
    private Map map;
    private Character[] character;
    private Clue clue;
    private Player player;
    private InventoryItem[] inventoryList;
    private Rumor rumor;
    private Scene scene;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Game() {
        date = new Date();
    }

    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate
    @Override
    public String toString() {
        return "Game{" + "score=" + score + ", date=" + date + '}';
    }

    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.score;
        hash = 17 * hash + Objects.hashCode(this.date);
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
        final Game other = (Game) obj;
        if (this.score != other.score) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    public int getScore() {
        return score;
    }

    public Date getDate() {
        return date;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Character[] getCharacter() {
        return character;
    }

    public void setCharacter(Character[] character) {
        this.character = character;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setInventoryItem(InventoryItem[] inventoryList) {
        this.inventoryList = inventoryList;
    }

    public InventoryItem[] getInventory() {
        return this.inventoryList;
    }

    public Clue getClue() {
        return clue;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }

    public Rumor getRumor() {
        return rumor;
    }

    public void setRumor(Rumor rumor) {
        this.rumor = rumor;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
