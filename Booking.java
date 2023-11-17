import java.time.*;
import java.text.DecimalFormat;

public class Booking {
    DecimalFormat df= new DecimalFormat("###,###.##");
    protected String typeRoom;
    protected double days_stay;
    protected LocalDateTime date_stay;
    protected String userName;
    protected long contactNum;
    protected int peopleStaying;
    protected char payment;
    protected double totalPrice;
    final static String[] rooms={"Standard Delight Room","Premium Delight Room","Standard Family Room","Premium Family Room","Executive Suite","Presidential Suite"};
    //                               0                          1                    2                        3                 4                  5
    final static double[] roomsPrice={5000,7500,10000,12500,20000,25000};
    //                              0     1    2     3     4     5

    public Booking(String room, double days, LocalDateTime date, String name, long conNum, int people, char pay){
        typeRoom = room;
        days_stay = days;
        date_stay = date;
        userName = name;
        contactNum = conNum;
        peopleStaying = people;
        payment = pay;
    }

    public static void hotelRoomDisplay(int pax){
        switch (pax) {
            case 1: case 2:
                System.out.println("\n[1]Standard Delight Room\nDescription:\nA standard room that houses one to two persons.\nThis room includes a comfortable bed, a TV, and a mini fridge\n");
                System.out.println("\n[2]Premium Delight Room\nDescription:\nA premium room that houses one to two persons.\nThis room has a stylish decor and includes a smart TV, a luxury bed, and a mini bar.\n");
                System.out.println("[3]Go Back");
                break;
            case 3: case 4:
                System.out.println("\n[1]Standard Family Room\nDescription:\nA standard room that houses three to four persons.\nThis room includes a bunk bed, a sofa bed, a mini fridge, and a microwave.\n");
                System.out.println("\n[2]Premium Family Room\nDescription:\nA premium room that house three to four persons.\nThis room includes a king-sized bed, a sofa bed, and a kitchenette\n");
                System.out.println("[3]Go Back");
                break;
            case 5: case 6: case 7: case 8:
                System.out.println("\n[1]Executive Suite\nDescription:\nA spacious and elegant suite with a separate living room, a work desk, and a king-sized bed.This suite can house five to eight persons.\nThe suite features a 55-inch smart TV, a Nespresso machine, and a minibar. The bathroom has a rain shower, a bathtub, and a bidet.\nThe suite also offers a stunning view of the city skyline\n");
                System.out.println("\n[2]Presidential Suite\nDescription:\nA luxurious and exclusive suite with a large living room, a dining area, and a master bedroom.This suite can house for five to eight persons.\nThe suite features a 65-inch smart TV, a Bose sound system, and a wine cooler. The bathroom has a jacuzzi, a sauna, and a steam room.\nThe suite also has a private balcony with a hot tub and a panoramic view of the city.\n");
                System.out.println("[3]Go Back");
                break;
            default:
                System.out.println("The hotel room can accomodate at a minimum of 1 person and a maximum of 8 people.");
                break;
        }
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