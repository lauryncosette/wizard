package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.exceptions.PlayerControlException;

public class PlayerControl throws PlayerControlException {

    /**
     *
     * @param killerHeight
     * @param characterHeight
     * @param distance
     * @return
     * @throws PlayerControlException
     */
    public double calcKillerHint(double killerHeight, double characterHeight, double distance) throws PlayerControlException {

        //if statement that determines if the inputs fit within the boudaries returning errors or positives.
        if (characterHeight <= 0 || characterHeight >= 10) {
                throw new PlayerControlException("Character's height " + characterHeight + " is not a valid number."
                                                +"  Character's height must be greater than 0 and less than 10.");
        }

        if (killerHeight != 6.7) {
                throw new PlayerControlException("Killer's height " + killerHeight + " is not a valid number.");
        }

        //error was distane was >= 6.  6 is the desired distance number.  Simple fix.
        if (distance <= 0 || distance >= 7) {
                throw new PlayerControlException("The distance betteween the body and blood splatter is not correct.");
        }

        double answer = (killerHeight * -1 / distance) * distance + characterHeight;
        return 1;

    }

    public double calcScoreFirstTry(int necessaryItem, int unnecessaryItem, int characterNumber) throws PlayerControlException {
        //if statement that determines if the inputs fit within the boundaries returning errors or positives.
        if (necessaryItem <= -1 || necessaryItem >= 7) {
                throw new PlayerControlException("The number of clues in inventory cannot be negative or be greater than"
                        + " the number of clues available.");
        }

        if (unnecessaryItem <= -1 || unnecessaryItem >= 43) {
                throw new PlayerControlException("The number of items in inventory cannot be negative or be greater than"
                        + " the total number of items available.");
        }

        if (characterNumber <= -1 || characterNumber >= 2) {
                throw new PlayerControlException("Characters are preasigned a number.  The number is invalid.");
        }

        //score is not returned yet.  This was set up for testing.
        double score = 100 + ((6 - necessaryItem) - 2.5) + (unnecessaryItem - (5 / 14)) + (-50 * (1 - characterNumber));;
        return 1;

    }
}
