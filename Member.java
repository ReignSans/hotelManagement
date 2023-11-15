import java.time.LocalDateTime;

public class Member extends Booking{
    protected double discount;

    public Member(String room, double days, LocalDateTime date, String name, long conNum, int people, char pay, double disc){
        super(room, days, date, name, conNum, people, pay);
        discount = disc;
    }
    
    public void display(){
        super.display();
        System.out.println("Discount : " + discount);
    }
}
