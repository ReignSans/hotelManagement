import java.time.LocalDateTime;

public class Regular extends Booking {
    protected String[] extraServices;
    
    public Regular(String room, double days, LocalDateTime date, String name, long conNum, int people, char pay, String[] extrServ){
        super(room, days, date, name, conNum, people, pay);
        extraServices = extrServ;
    }

    public void display(){
        super.display();
        System.out.println("Extra Services : " + extraServices);
    }
}
