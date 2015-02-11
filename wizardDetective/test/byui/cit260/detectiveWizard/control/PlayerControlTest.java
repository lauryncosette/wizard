/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detectiveWizard.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassandra
 */
public class PlayerControlTest {
    
    public PlayerControlTest() {
    }

    /**
     * Test of calcKillerHint method, of class PlayerControl.
     */
    @Test
    public void testCalcKillerHint() {
        System.out.println("calcKillerHint");
    
        // Test case one
        System.out.println ("test case #1");
        
        double killerHeight = 6.7;
        double characterHeight = 6.7;
        double distance = 6;
        PlayerControl instance = new PlayerControl();
        double expResult = 0;
        double result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test case 2
        //System.out.println ("test case #2");
        
        //input
        //killerHeight = 6.7;
        //characterHeight = 0;
        //distance = 6;
        
        //expected output
        //expResult = -1;
        
        //call function
        //result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        
        //compare expected return with actual return
        //assertEquals(expResult, result, 0.0001);
        
        //Test case 3
        //System.out.println ("test case #3");
        
        //input
        //killerHeight = 0;
        //characterHeight = 7;
        //distance = 6;
        
        //expected output
        //expResult = -2;
        
        //call function
        //result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        
        //compare expected return with actual return
        //assertEquals(expResult, result, 0.0001);
        
        //Test case 4
        //System.out.println ("test case #4");
        
        //input
        //killerHeight = 6.7;
        //characterHeight = 6;
        //distance = 0;
        
        //expected output
        //expResult = -3;
        
        //call function
        //result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        
        //compare expected return with actual return
        //assertEquals(expResult, result, 0.0001);
        
        //ctrl f6 to run test
    }
    
}
