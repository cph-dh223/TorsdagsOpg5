package Task3;

import java.util.ArrayList;

public class Building {
    private final ArrayList<Room> rooms;
    private final int numberOfBathrooms;
    private final int numberOfFloors;
    private final boolean isOfficeBuilding;
    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
