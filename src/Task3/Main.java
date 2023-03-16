package Task3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var r1 = new Room(1,1,1);
        var r2 = new Room(2,2,2);
        var r3 = new Room(3,3,3);
        var rooms = new ArrayList<Room>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        var b = new Building(rooms,1,1,false);
    }
    public static int countLampsInBuilding(Building b){
        int numLamps = 0;
        for(Room r : b.getRooms()){
            numLamps += r.getNumberOfLamps();
        }
        return numLamps;
    }
    public static boolean isNormal (Building b){
        if(b.getRooms().size() > b.getNumberOfFloors()) return true;
        else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
