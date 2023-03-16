package Task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MainTests {

    Building b;
    @BeforeEach
    void beforeEach(){
        var r1 = new Room(1,1,1);
        var r2 = new Room(2,2,2);
        var r3 = new Room(3,3,3);
        var rooms = new ArrayList<Room>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        b = new Building(rooms,1,1,false);
    }
    @AfterEach
    void afterEach(){
        b = null;
    }

    @Test
    void countLampsInBuilding(){
        assertEquals(6,Main.countLampsInBuilding(b));
    }
    @Test
    void isNormal(){
        assertTrue(Main.isNormal(b));
    }
}
