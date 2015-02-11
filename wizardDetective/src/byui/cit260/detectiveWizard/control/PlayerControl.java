/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.control;

/**
 *
 * @author Cassandra
 */
public class PlayerControl {

        public double calcKillerHint(double killerHeight, double characterHeight, double distance){
            
            //if statement that determines if the inputs fit within the boudaries returning errors or positives.
        if(characterHeight <=0 || characterHeight >=10){
            return -1;
        }
        
        else if(killerHeight !=6.7){
            return -2;
        }
    
        else if(distance <=0 || distance >=6){
            return -3;    
        }
        
        else {
            
            double answer = (killerHeight * -1 / distance) * distance + characterHeight;
            
            if (answer == 0){
                return answer;
            }
            
            else {
                return 1;
            }
        }
    }
}