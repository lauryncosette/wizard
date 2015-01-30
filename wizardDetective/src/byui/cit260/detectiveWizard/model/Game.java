/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author Cassandra
 */
public class Game implements Serializable{
    
    //class instance variables
    private int score;
    private Date date;
    
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
    
    public int getScore(){
        return score;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
}
