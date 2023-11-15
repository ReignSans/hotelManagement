import java.time.LocalDateTime;

public class VIPMember extends Member{
    protected int[] vipServices;

    public VIPMember(String room, double days, LocalDateTime date, String name, long conNum, int people, char pay, double disc, int[] vipServ){
        super(room, days, date, name, conNum, people, pay, disc);
        vipServices = vipServ;
    }

    public void display(){
        super.display();
        System.out.println("Additional VIP Services : " + vipServices);
        
    }
}
