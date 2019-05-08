import java.util.ArrayList;

public class Hotel {

    private String name;
    public ArrayList<Bedroom> bedrooms;
    public ArrayList<DiningRoom> diningRooms;
    public ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guests;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    public ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
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
            bedroom.capacity -= 1;
        }
    }

    public void checkInGuestToDiningRoom(Guest guest, DiningRoom diningRoom) {
        if(diningRoom.capacity > diningRoom.countGuests()) {
            guests.add(guest);
            diningRoom.guests.add(guest);
            diningRoom.capacity -= 1;
        }
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if(conferenceRoom.capacity > conferenceRoom.countGuests()) {
            guests.add(guest);
            conferenceRoom.guests.add(guest);
            conferenceRoom.capacity -= 1;
        }
    }

    public Booking makeBooking(Bedroom bedroom, int nights){
        Booking newBooking = new Booking(bedroom, nights);
        bookings.add(newBooking);
        return newBooking;
    }

    public int countBookings(){
        return bookings.size();
    }

    public void checkOutGuestFromBedroom(Guest guest, Bedroom bedroom) {
        bedroom.guests.remove(guest);
        guests.remove(guest);
    }

    public void checkOutGuestFromDiningRoom(Guest guest, DiningRoom diningRoom) {
        diningRoom.guests.remove(guest);
        guests.remove(guest);
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.guests.remove(guest);
        guests.remove(guest);
    }

    public int getTotalBill(Booking booking) {
        return booking.bedroom.nightlyRate * booking.nights;
    }

    public ArrayList viewVacantRooms(){
        ArrayList<Bedroom> vacantRooms = new ArrayList<>();
        for (Bedroom bedroom : bedrooms){
            if (bedroom.capacity == 0){
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }

    public int countVacantRooms() {
        return viewVacantRooms().size();
    }
}
