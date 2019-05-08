import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private String type;
    public int capacity;
    public ArrayList<Guest> guests;
    public int nightlyRate;

    public Bedroom(int roomNumber, String type, int capacity, int nightlyRate){
        this.roomNumber = roomNumber;
        this.type = type;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countGuests() {
        return guests.size();
    }
}
