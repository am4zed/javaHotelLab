import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(101, "double", 2, 50);
        bedroom2 = new Bedroom(102, "single", 1, 50);
        diningRoom = new DiningRoom("Breakfast Room", 4);
        conferenceRoom = new ConferenceRoom("The Robert Burns Room", 4);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
        guest4 = new Guest();
        guest5 = new Guest();
        hotel.bedrooms.add(bedroom1);
        hotel.bedrooms.add(bedroom2);
        hotel.diningRooms.add(diningRoom);
        hotel.conferenceRooms.add(conferenceRoom);
        booking = new Booking(bedroom1, 3);

    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void hasDiningRooms(){
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void hasNoGuestsAtStart(){
        assertEquals(0, hotel.countGuests());
    }

    @Test
    public void canCheckGuestsInToBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, hotel.countGuests());
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void cannotCheckGuestsInToBedroomCapacityFull(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkInGuestToBedroom(guest2, bedroom1);
        hotel.checkInGuestToBedroom(guest3, bedroom1);
        assertEquals(2, hotel.countGuests());
        assertEquals(2, bedroom1.countGuests());
    }

    @Test
    public void canCheckGuestsInToDiningRoom(){
        hotel.checkInGuestToDiningRoom(guest1, diningRoom);
        assertEquals(1, hotel.countGuests());
        assertEquals(1, diningRoom.countGuests());
    }

    @Test
    public void cannotCheckGuestsInToDiningRoomCapacityFull(){
        hotel.checkInGuestToDiningRoom(guest1, diningRoom);
        hotel.checkInGuestToDiningRoom(guest2, diningRoom);
        hotel.checkInGuestToDiningRoom(guest3, diningRoom);
        hotel.checkInGuestToDiningRoom(guest4, diningRoom);
        hotel.checkInGuestToDiningRoom(guest5, diningRoom);
        assertEquals(4, hotel.countGuests());
        assertEquals(4, diningRoom.countGuests());
    }

    @Test
    public void canCheckGuestsInToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom);
        assertEquals(1, hotel.countGuests());
        assertEquals(1, conferenceRoom.countGuests());
    }

    @Test
    public void cannotCheckGuestsInToConferenceRoomCapacityFull(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom);
        hotel.checkInGuestToConferenceRoom(guest2, conferenceRoom);
        hotel.checkInGuestToConferenceRoom(guest3, conferenceRoom);
        hotel.checkInGuestToConferenceRoom(guest4, conferenceRoom);
        hotel.checkInGuestToConferenceRoom(guest5, conferenceRoom);
        assertEquals(4, hotel.countGuests());
        assertEquals(4, conferenceRoom.countGuests());
    }

    @Test
    public void canCheckoutGuestsOfBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkOutGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, hotel.countGuests());
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void canCheckoutGuestsOfDiningRoom(){
        hotel.checkInGuestToDiningRoom(guest1, diningRoom);
        hotel.checkOutGuestFromDiningRoom(guest1, diningRoom);
        assertEquals(0, hotel.countGuests());
        assertEquals(0, diningRoom.countGuests());
    }

    @Test
    public void canCheckoutGuestsOfConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom);
        assertEquals(0, hotel.countGuests());
        assertEquals(0, conferenceRoom.countGuests());
    }


//
    @Test
    public void canMakeABooking(){
        assertEquals(0, hotel.countBookings());
        hotel.makeBooking(bedroom1, 3);
        assertEquals(1, hotel.countBookings());
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(150, hotel.getTotalBill(booking));
    }

    @Test
    public void canSeeVacantBedrooms(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, hotel.countVacantRooms());
    }




}
