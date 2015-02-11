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
        //System.out.println ("test case #1");
        
        double killerHeight = 6.7;
        double characterHeight = 6.7;
        double distance = 6;
        PlayerControl instance = new PlayerControl();
        double expResult = 0;
        double result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        // test case 1 failed
        
        
        //Test case 2
        //System.out.println ("test case #2");
        
        //input
        //double killerHeight = 6.7;
        //double characterHeight = 0;
        //double distance = 6;
        
        //expected output
        //double expResult = -1;
        
        //call function
        //double result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        
        //compare expected return with actual return
        //assertEquals(expResult, result, 0.0001);
        
        // test case 2 passed
        
        
        //Test case 3
        //System.out.println ("test case #3");
        
        //input
        //double killerHeight = 0;
        //double characterHeight = 7;
        //double distance = 6;
        
        //expected output
        //double expResult = -2;
        
        //call function
        //double result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        
        //compare expected return with actual return
        //assertEquals(expResult, result, 0.0001);
        
        // test case 3 passed
        
        
        //Test case 4
        //System.out.println ("test case #4");
        
        //input
        //double killerHeight = 6.7;
        //double characterHeight = 6;
        //double distance = 0;
        
        //expected output
        //double expResult = -3;
        
        //call function
        //double result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        
        //compare expected return with actual return
        //assertEquals(expResult, result, 0.0001);
        
        //test case 4 passed
        
        
        //ctrl f6 to run test
    }
    
}
