package byui.cit260.detectiveWizard.control;

import byui.cit260.detectiveWizard.exceptions.MapControlException;
import byui.cit260.detectiveWizard.model.Character;
import byui.cit260.detectiveWizard.model.Game;
import byui.cit260.detectiveWizard.model.Location;
import byui.cit260.detectiveWizard.model.Map;
import byui.cit260.detectiveWizard.model.Scene;
import detectiveWizard.DetectiveWizard;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class MapControl {

    public static Map createMap() throws MapControlException {

        //create new map
        Map map = new Map(5, 5);

        //create a list of the different scenes
        Scene[] scenes = createScenes();

        //assign the different scenes to locations
        assignScenesToLocations(map, scenes);

        return map;
    }

    public static void moveActorsToStartingLocation(Map map) throws MapControlException {
        Character[] characters = Character.values();

        for (Character character : characters) {
            Point coordinates = character.getCoordinates();
            MapControl.moveActorsToLocation(character, coordinates);
        }
    }

    public static void moveActorsToLocation(Character character, Point coordinates) throws MapControlException {

        Map map = DetectiveWizard.getCurrentGame().getMap();
        int newRow = coordinates.x - 1;
        int newColumn = coordinates.y - 1;

        if (newRow < 0 || newRow >= map.getRows() || newColumn < 0 || newColumn >= map.getColumns()) {
            throw new MapControlException("Can not move character to location " + coordinates.x + ", "
                    + coordinates.y + " because that location is outside "
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
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene failedScene = new Scene();
        failedScene.setDescription(
                "\nI'm sorry, you have accused the wrong person of killing the victim.");
        failedScene.setMapSymbol(" FS ");
        failedScene.setBlocked(false);
        scenes[SceneType.failed.ordinal()] = failedScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations!  You were able to solve the mystery!");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        Scene kitchenScene = new Scene();
        kitchenScene.setDescription(
                "\nOnly employees are allowed in the kitchen.");
        kitchenScene.setMapSymbol(" KT ");
        kitchenScene.setBlocked(false);
        scenes[SceneType.kitchen.ordinal()] = kitchenScene;
        
        Scene entryRoomScene = new Scene();
        entryRoomScene.setDescription(
                "\nPresidential suite.");
        entryRoomScene.setMapSymbol(" PS ");
        entryRoomScene.setBlocked(false);
        scenes[SceneType.entryRoom.ordinal()] = entryRoomScene;
        
        Scene bedroomScene = new Scene();
        bedroomScene.setDescription(
                "\nPresidential suite bedroom.");
        bedroomScene.setMapSymbol(" PM ");
        bedroomScene.setBlocked(false);
        scenes[SceneType.bedroom.ordinal()] = bedroomScene;
        
        Scene bathroomScene = new Scene();
        bathroomScene.setDescription(
                "\nPresidential suite bathroom.");
        bathroomScene.setMapSymbol(" PB ");
        bathroomScene.setBlocked(false);
        scenes[SceneType.bathroom.ordinal()] = bathroomScene;
        
        Scene mainLobbyScene = new Scene();
        mainLobbyScene.setDescription(
                "\nMain Lobby.");
        mainLobbyScene.setMapSymbol(" ML ");
        mainLobbyScene.setBlocked(false);
        scenes[SceneType.mainLobby.ordinal()] = mainLobbyScene;
        
        Scene janitorOfficeScene = new Scene();
        janitorOfficeScene.setDescription(
                "\nJanitorial office.");
        janitorOfficeScene.setMapSymbol(" JO ");
        janitorOfficeScene.setBlocked(false);
        scenes[SceneType.janitorOffice.ordinal()] = janitorOfficeScene;
        
        Scene janitorClosetScene = new Scene();
        janitorClosetScene.setDescription(
                "\nJanitor closet.");
        janitorClosetScene.setMapSymbol(" JC ");
        janitorClosetScene.setBlocked(false);
        scenes[SceneType.janitorCloset.ordinal()] = janitorClosetScene;
        
        Scene wineCellerScene = new Scene();
        wineCellerScene.setDescription(
                "\nWine celler.");
        wineCellerScene.setMapSymbol(" WC ");
        wineCellerScene.setBlocked(false);
        scenes[SceneType.wineCeller.ordinal()] = wineCellerScene;
        
        Scene banquetHallScene = new Scene();
        banquetHallScene.setDescription(
                "\nBanquet hall.");
        banquetHallScene.setMapSymbol(" BH ");
        banquetHallScene.setBlocked(false);
        scenes[SceneType.banquetHall.ordinal()] = banquetHallScene;
        
        Scene laundryRoomScene = new Scene();
        laundryRoomScene.setDescription(
                "\nLaundry room.");
        laundryRoomScene.setMapSymbol(" LR ");
        laundryRoomScene.setBlocked(false);
        scenes[SceneType.laundryRoom.ordinal()] = laundryRoomScene;
        
        Scene room101Scene = new Scene();
        room101Scene.setDescription(
                "\nRoom 101.");
        room101Scene.setMapSymbol(" 01 ");
        room101Scene.setBlocked(false);
        scenes[SceneType.room101.ordinal()] = room101Scene;
        
        Scene room102Scene = new Scene();
        room102Scene.setDescription(
                "\nRoom 102.");
        room102Scene.setMapSymbol(" 02 ");
        room102Scene.setBlocked(false);
        scenes[SceneType.room102.ordinal()] = room102Scene;
        
        Scene room103Scene = new Scene();
        room103Scene.setDescription(
                "\nRoom 103.");
        room103Scene.setMapSymbol(" 03 ");
        room103Scene.setBlocked(false);
        scenes[SceneType.room103.ordinal()] = room103Scene;
        
        Scene room104Scene = new Scene();
        room104Scene.setDescription(
                "\nRoom 104.");
        room104Scene.setMapSymbol(" 04 ");
        room104Scene.setBlocked(false);
        scenes[SceneType.room104.ordinal()] = room104Scene;
        
        Scene room105Scene = new Scene();
        room105Scene.setDescription(
                "\nRoom 105.");
        room105Scene.setMapSymbol(" 05 ");
        room105Scene.setBlocked(false);
        scenes[SceneType.room105.ordinal()] = room105Scene;
        
        Scene room106Scene = new Scene();
        room106Scene.setDescription(
                "\nRoom 106.");
        room106Scene.setMapSymbol(" 06 ");
        room106Scene.setBlocked(false);
        scenes[SceneType.room106.ordinal()] = room106Scene;
        
        Scene room107Scene = new Scene();
        room107Scene.setDescription(
                "\nRoom 107.");
        room107Scene.setMapSymbol(" 07 ");
        room107Scene.setBlocked(false);
        scenes[SceneType.room107.ordinal()] = room107Scene;
        
        Scene room108Scene = new Scene();
        room108Scene.setDescription(
                "\nRoom 108.");
        room108Scene.setMapSymbol(" 08 ");
        room108Scene.setBlocked(false);
        scenes[SceneType.room108.ordinal()] = room108Scene;
        
        Scene room109Scene = new Scene();
        room109Scene.setDescription(
                "\nRoom 109.");
        room109Scene.setMapSymbol(" 09 ");
        room109Scene.setBlocked(false);
        scenes[SceneType.room109.ordinal()] = room109Scene;
        
        Scene room110Scene = new Scene();
        room110Scene.setDescription(
                "\nRoom 110.");
        room110Scene.setMapSymbol(" 10 ");
        room110Scene.setBlocked(false);
        scenes[SceneType.room110.ordinal()] = room110Scene;
        
        Scene room111Scene = new Scene();
        room111Scene.setDescription(
                "\nRoom 111.");
        room111Scene.setMapSymbol(" 11 ");
        room111Scene.setBlocked(false);
        scenes[SceneType.room111.ordinal()] = room111Scene;
        
        Scene room112Scene = new Scene();
        room112Scene.setDescription(
                "\nRoom 112.");
        room112Scene.setMapSymbol(" 12 ");
        room112Scene.setBlocked(false);
        scenes[SceneType.room112.ordinal()] = room112Scene;
        
        Scene poolScene = new Scene();
        poolScene.setDescription(
                "\nThe swimming pool.");
        poolScene.setMapSymbol(" PO ");
        poolScene.setBlocked(false);
        scenes[SceneType.pool.ordinal()] = poolScene;
        
        Scene loungeScene = new Scene();
        loungeScene.setDescription(
                "\nVIP lounge area.");
        loungeScene.setMapSymbol(" LO ");
        loungeScene.setBlocked(false);
        scenes[SceneType.lounge.ordinal()] = loungeScene;
        
        Scene barScene = new Scene();
        barScene.setDescription(
                "\nBar.");
        barScene.setMapSymbol(" BA ");
        barScene.setBlocked(false);
        scenes[SceneType.bar.ordinal()] = barScene;

        return scenes;
    }

    public enum SceneType {

        start,
        failed,
        finish,
        kitchen,
        entryRoom,
        bedroom,
        bathroom,
        mainLobby,
        janitorOffice,
        janitorCloset,
        wineCeller,
        banquetHall,
        laundryRoom,
        room101,
        room102,
        room103,
        room104,
        room105,
        room106,
        room107,
        room108,
        room109,
        room110,
        room111,
        room112,
        pool,
        lounge,
        bar;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.mainLobby.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.kitchen.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.entryRoom.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.bedroom.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.bathroom.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.janitorOffice.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.janitorCloset.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.wineCeller.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.banquetHall.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.laundryRoom.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.room101.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.room102.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.room103.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.room104.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.room105.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.room106.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.room107.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.room108.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.room109.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.room110.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.room111.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.room112.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.pool.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.lounge.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.bar.ordinal()]);
    }
}
