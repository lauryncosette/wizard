
package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.exceptions.MapControlException;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.Location;
import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.Scene;
import detectiveWizard.DetectiveWizard;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class MapControl {

    public static Map createMap() throws MapControlException{
        
        //create new map
        Map map = new Map(5, 5);
        
        //create a list of the different scenes
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    static void moveActorsToStartingLocation(Map map)
            throws MapControlException {
        System.out.println("*** called moveActorsToStartingLocation() ***");
    }
    
    public static void moveActorsToLocation(Character character, Point coordinates) throws MapControlException{
        
        Map map = DetectiveWizard.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRows()|| newColumn< 0 || newColumn >= map.getColumns()){
            throw new MapControlException ("Can not move character to location " + coordinates.x + ", "
                                           + coordinates.y + "because that location is outside "
                                           + "the bonds of the map.");
        }
    }

    private static Scene[] createScenes() throws MapControlException {
        
        BufferedImage image = null;
        
        Game game = DetectiveWizard.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
              "\nLate into the night you received a call from the office."
            + "\n'Detective, I know it's late but we need you.  There has been a"
            + "\nmurder at the StarSeries hotel on 16th.  We need you there as"
            + "\nsoon as possible.'");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        ImageIcon startingSceneImage = MapControl.getImage(startingScene,
                "/byui.cit260.detectiveWizard/images/finish.jpg");
        startingScene.setIcon(startingSceneImage);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene failedScene = new Scene();
        failedScene.setDescription(
              "\nI'm sorry, you have accused the wrong person of killing the victim.");
        failedScene.setMapSymbol(" FS ");
        failedScene.setBlocked(false);
        ImageIcon failedSceneImage = MapControl.getImage(failedScene,
                "/byui.cit260.detectiveWizard/images/finish.jpg");
        failedScene.setIcon(failedSceneImage);
        scenes[SceneType.failed.ordinal()] = failedScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
              "\nCongratulations!  You were able to solve the mystery!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        ImageIcon finishSceneImage = MapControl.getImage(finishScene,
                "/byui.cit260.detectiveWizard/images/finish.jpg");
        finishScene.setIcon(finishSceneImage);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    private static ImageIcon getImage(Scene startingScene, String byuicit260detectiveWizardimagesfinishjpg) throws MapControlException {
        System.out.println("*** function getImage ***");
        throw new MapControlException("Can not get this image.");
  
    }

    public enum SceneType{
        start,
        failed,
        finish;
    }
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
    }
}
