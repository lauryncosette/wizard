
package byui.cit260.detectiveWizard.model;

import java.io.Serializable;

public class Map implements Serializable{
    
    private Location[][] locations;
    //do we need this
    //private final Game game;
    private int rows;
    private int columns;

    public Map(int rows, int columns) {
        if (rows < 1 || columns < 1){
            System.out.println("The number of rows and columns must be > 0");
            return;
        }
        
        this.rows = rows;
        this.columns = columns;
        
        this.locations = new Location[rows][columns];
        
        for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                location[row][column] = location;
            }
        }
    }
    
    public Location[][] getLocations(){
        return locations;
    }
    
    public void setLocation(Location[][] locations){
        this.locations = locations;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
