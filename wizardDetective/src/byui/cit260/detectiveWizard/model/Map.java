package byui.cit260.detectiveWizard.model;

import detectiveWizard.DetectiveWizard;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;

public class Map implements Serializable {

    protected final BufferedReader keyboard = DetectiveWizard.getInFile();
    protected final PrintWriter console = DetectiveWizard.getOutFile();

    private Location[][] locations;
    //do we need this
    //private final Game game;
    private int rows;
    private int columns;

    public Map(int rows, int columns) {
        //does this need to have an error message here???
        if (rows < 1 || columns < 1) {
            this.console.println("The number of rows and columns must be > 0");
            return;
        }

        this.rows = rows;
        this.columns = columns;

        this.locations = new Location[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                locations[row][column] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocation(Location[][] locations) {
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
