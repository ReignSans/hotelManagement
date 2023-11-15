import java.time.*;

public class Booking {
    protected String typeRoom;
    protected double days_stay;
    protected LocalDateTime date_stay;
    protected String userName;
    protected long contactNum;
    protected int peopleStaying;
    protected char payment;

    public Booking(String room, double days, LocalDateTime date, String name, long conNum, int people, char pay){
        typeRoom = room;
        days_stay = days;
        date_stay = date;
        userName = name;
        contactNum = conNum;
        peopleStaying = people;
        payment = pay;
    }

    public void display(){
        System.out.println("--Booking Receipt--");
        System.out.println("Name : " + userName);
        System.out.println("Contact Number : " + contactNum);
        System.out.println("Date of Reservation : " + date_stay);
        System.out.println("Type of Room : " + typeRoom);
        System.out.println("Days of Stay : " + days_stay);
    }
}