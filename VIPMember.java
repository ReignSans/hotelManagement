import java.time.LocalDateTime;

public class VIPMember extends Member{
    protected String[] vipServices;

    public VIPMember(String room, double days, LocalDateTime date, String name, long conNum, int people, char pay, double disc, String[] vipServ){
        super(room, days, date, name, conNum, people, pay, disc);
        vipServices = vipServ;
    }

    public void display(){
        super.display();
        System.out.println("Additional VIP Services : " + vipServices);
        
    }
}
