import java.util.ArrayList;

public class DiningRoom {

    public int capacity;
    private String name;
    public ArrayList<Guest> guests;

    public DiningRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public int countGuests() {
        return guests.size();
    }
}
