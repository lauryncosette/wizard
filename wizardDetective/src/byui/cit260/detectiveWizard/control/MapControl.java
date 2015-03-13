
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Map;

public class MapControl {

    public static Map createMap() throws MapControlException{
        System.out.println("*** called createMap() ***");
        return null;
    }
    static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation() ***");
    }

    public static class MapControlException extends Exception {

        public MapControlException() {
        }
    }
    
}
