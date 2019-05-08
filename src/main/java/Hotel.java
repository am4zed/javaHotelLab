import java.util.ArrayList;

public class Hotel {

    private String name;
    public ArrayList<Bedroom> bedrooms;
    public ArrayList<DiningRoom> diningRooms;
    public ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guests;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int countBedrooms() {
        return bedrooms.size();
    }

    public int countDiningRooms() {
        return diningRooms.size();
    }

    public int countConferenceRooms() {
        return conferenceRooms.size();
    }

    public int countGuests() {
        return guests.size();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        if(bedroom.capacity > bedroom.countGuests()) {
            guests.add(guest);
            bedroom.guests.add(guest);
        }
    }

    public void checkInGuestToDiningRoom(Guest guest, DiningRoom diningRoom) {
        if(diningRoom.capacity > diningRoom.countGuests()) {
            guests.add(guest);
            diningRoom.guests.add(guest);
        }
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if(conferenceRoom.capacity > conferenceRoom.countGuests()) {
            guests.add(guest);
            conferenceRoom.guests.add(guest);
        }
    }
}
