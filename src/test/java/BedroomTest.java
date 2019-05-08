import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        bedroom = new Bedroom(101, "double", 2 );
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasNoGuestsAtStart(){
        assertEquals(0, bedroom.countGuests());
    }

}
