package byui.cit260.detectiveWizard.control;

import org.junit.Test;
import static org.junit.Assert.*;

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
        System.out.println("test case #1");

        double killerHeight = 6.7;
        double characterHeight = 6.7;
        double distance = 6;
        PlayerControl instance = new PlayerControl();
        double expResult = 0;
        double result = instance.calcKillerHint(killerHeight, characterHeight, distance);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        // test case 1 pass
        //Test case 2
        System.out.println("test case #2");

        //input
        killerHeight = 6.7;
        characterHeight = 0;
        distance = 6;
        instance = new PlayerControl();
        //expected output
        expResult = -1;

        //call function
        result = instance.calcKillerHint(killerHeight, characterHeight, distance);

        //compare expected return with actual return
        assertEquals(expResult, result, 0.0001);

        // test case 2 passed
        //Test case 3
        System.out.println("test case #3");

        //input
        killerHeight = 0;
        characterHeight = 7;
        distance = 6;
        instance = new PlayerControl();
        //expected output
        expResult = -2;

        //call function
        result = instance.calcKillerHint(killerHeight, characterHeight, distance);

        //compare expected return with actual return
        assertEquals(expResult, result, 0.0001);

        // test case 3 passed
        //Test case 4
        System.out.println("test case #4");

        //input
        killerHeight = 6.7;
        characterHeight = 6;
        distance = 0;
        instance = new PlayerControl();
        //expected output
        expResult = -3;

        //call function
        result = instance.calcKillerHint(killerHeight, characterHeight, distance);

        //compare expected return with actual return
        assertEquals(expResult, result, 0.0001);

        //test case 4 passed
        //ctrl f6 to run test
    }

    /**
     * Test of calcScoreFirstTry method, of class PlayerControl.
     */
    @Test
    public void testCalcScoreFirstTry() {
        System.out.println("calcScoreFirstTry");
        System.out.println("Test #1");
        int necessaryItem = 0;
        int unnecessaryItem = 0;
        int characterNumber = 0;
        PlayerControl instance = new PlayerControl();
        double expResult = 1;
        double result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

        //Test one pass
        System.out.println("Test #2");
        necessaryItem = 6;
        unnecessaryItem = 42;
        characterNumber = 1;

        expResult = 1;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test two pass
        System.out.println("Test #3");
        necessaryItem = -1;
        unnecessaryItem = 42;
        characterNumber = 1;

        expResult = -1;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test three pass
        System.out.println("Test #4");
        necessaryItem = 7;
        unnecessaryItem = 42;
        characterNumber = 1;

        expResult = -1;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test four pass
        System.out.println("Test #5");
        necessaryItem = 6;
        unnecessaryItem = -1;
        characterNumber = 1;

        expResult = -2;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test five pass
        System.out.println("Test #6");
        necessaryItem = 6;
        unnecessaryItem = 43;
        characterNumber = 1;

        expResult = -2;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test six pass
        System.out.println("Test #7");
        necessaryItem = 6;
        unnecessaryItem = 42;
        characterNumber = -1;

        expResult = -3;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test seven pass
        System.out.println("Test #8");
        necessaryItem = 6;
        unnecessaryItem = 42;
        characterNumber = 2;

        expResult = -3;
        result = instance.calcScoreFirstTry(necessaryItem, unnecessaryItem, characterNumber);
        assertEquals(expResult, result, 0.0001);

        //Test eight pass
    }

}
