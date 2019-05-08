public class Booking {

    public Bedroom bedroom;
    public int nights;

    public Booking(Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

//    @Override
//    public boolean equals (Booking booking){
//        if (!(booking instanceof Booking)){
//            return false;
//        }
//        Booking booking1 = booking;
//
//        return this.bedroom.equals.(booking1.bedroom)
//                && this.nights.equals.(booking1.nights);
//    }
}
