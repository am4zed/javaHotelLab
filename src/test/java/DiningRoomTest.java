import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Breakfast Room", 4);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
        guest4 = new Guest();
        guest5 = new Guest();
    }

    @Test
    public void hasName(){
        assertEquals("Breakfast Room", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, diningRoom.getCapacity());
    }

    @Test
    public void hasNoGuestsAtStart(){
        assertEquals(0, diningRoom.countGuests());
    }

}
