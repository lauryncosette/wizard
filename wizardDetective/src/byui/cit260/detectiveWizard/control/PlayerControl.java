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
    
            //error was distane was >= 6.  6 is the desired distance number.  Simple fix.
            else if(distance <=0 || distance >=7){
                return -3;    
            }
        
            else {
            
                double answer = (killerHeight * -1 / distance) * distance + characterHeight;
                return answer;
            }
        }
    
        public double calcScoreFirstTry(int necessaryItem, int unnecessaryItem, int characterNumber){
            //if statement that determines if the inputs fit within the boundaries returning errors or positives.
            if (necessaryItem <=-1 || necessaryItem >= 7){
                return -1;
            }
            
            else if (unnecessaryItem <=-1 || unnecessaryItem >=43){
                return -2;
            }
            
            else if (characterNumber <=-1 || characterNumber >=2){
                return -3;
            }
            
            else {
                double score = 100 + ((6 - necessaryItem) - 2.5) + (unnecessaryItem - (5 / 14)) + (-50 * (1 - characterNumber));;
                return 1;
            }
        }
}