
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.Scene;

public class MapControl {

    public static Map createMap(){
        
        //create new map
        Map map = new Map(5, 5);
        
        //create a list of the different scenes
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation() ***");
    }  

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
