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
 * @author Cassandra
 */
public class Player implements Serializable{
    
    //class instance variables
    private String name;
    private String role;
    private int score;
    private int numberOfClue = 7;
    
    //alt-fn-insert (Source-Insert Code), constructor, (do not select anything) generate
    public Player() {
    }
    
    //toString()
    //alt-fn-insert (Source-Insert Code), toString(), (select all) generate

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", role=" + role + ", score=" + score + ", numberOfClue=" + numberOfClue + '}';
    }
    
    //equals(), hashCode()
    //alt-fn-insert (Source-Insert Code), equals() and hashCode(), (select all)generate

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.role);
        hash = 97 * hash + this.score;
        hash = 97 * hash + this.numberOfClue;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        if (this.score != other.score) {
            return false;
        }
        if (this.numberOfClue != other.numberOfClue) {
            return false;
        }
        return true;
    }
    
    public String getName (){
        return name;
    }
    
    public String getRole(){
        return role;
    }
    
    public int getScore(){
        return score;
    }
    
    public int getNumberOfClue(){
        return numberOfClue;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void setNumberOfClue(){
        this.numberOfClue = numberOfClue;
    }
}
