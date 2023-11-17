import java.util.Scanner;
import java.util.InputMismatchException;
public class UseHotel {
    public static void main(String[] args) throws DataException {
        String decorator= "=";
        Scanner input= new Scanner(System.in);
        int pax;
        try{
            while(true){
                System.out.println("\nHello! My name is Reilosh, the virtual assistant of Reilosh Tranquility Hotel!" + 
                                   "\nPress Enter to start!"); input.nextLine();
                Booking guest;
                System.out.print(decorator.repeat(20)+
                                 "\n--Menu:--" + 
                                 "\n[1]Booking" + 
                                 "\n[2]List of Room Types" + 
                                 "\n[3]Exit\n" + 
                                 decorator.repeat(20)+"\nMenu Choice : "); int menuInput= input.nextInt();

                if(menuInput==1){
                    input.nextLine();
                    while(true){
                        System.out.print("Booking:\nEnter your Full Name : "); String name = input.nextLine();
                        System.out.print("Enter your Phone Number : "); long phoneNum = input.nextLong(); input.nextLine();
                        System.out.print("Enter your Email Address : "); String  address = input.nextLine();
                    
                        System.out.println("Name : " + name);
                        System.out.println("Phone Number : " + phoneNum);
                        System.out.println("Email Address : " + address);
                        System.out.print("Is this information written correct?[Y/N]: ");
                        char userInput= input.nextLine().toUpperCase().charAt(0);
                        if(userInput == 'Y'){
                            int roomInput = 3;
                            do{
                                System.out.println("\n==Please do keep in mind 8 is the max person per room==");
                                System.out.print("How many person will be staying? : "); pax= input.nextInt();
                                if(pax > 8 || pax < 1){
                                    throw new DataException(errorMessage.msg[1]);
                                } else {
                                    System.out.println("Finding the best room for you...\n");
                                    Booking.hotelRoomDisplay(pax);
                                    System.out.print("Room Choice: "); roomInput = input.nextInt();
                                }
                            } while(roomInput == 3);

                            String room = "";
                            Double price;
                            switch (pax) {
                                case 1: case 2:
                                    if(roomInput==1){
                                        room = Booking.rooms[0];
                                        price = Booking.roomsPrice[0];
                                        System.out.println("\nYou have chosen:\n" + room +"\nPrice: " + price);
                                
                                    }
                                    else if(roomInput==2){
                                        room = Booking.rooms[1];
                                        price = Booking.roomsPrice[1];
                                        System.out.println("You have chosen :" + room);
                                        System.out.println("Price: " + price);
                                    }
                                    break;
                                case 3: case 4:
                                    if(roomInput==1){
                                        room = Booking.rooms[2];
                                        price = Booking.roomsPrice[2];
                                        System.out.println("You have chosen :" + room);
                                        System.out.println("Price: " + price);
                                
                                    }
                                    else if(roomInput==2){
                                        room = Booking.rooms[3];
                                        price = Booking.roomsPrice[3];
                                        System.out.println("You have chosen :" + room);
                                        System.out.println("Price: " + price);
                                    }
                                    break;
                                case 5: case 6: case 7: case 8:
                                    if(roomInput==1){
                                        room = Booking.rooms[4];
                                        price = Booking.roomsPrice[4];
                                        System.out.println("You have chosen :" + room);
                                        System.out.println("Price: " + price);
                                
                                    }
                                    else if(roomInput==2){
                                        room = Booking.rooms[5];
                                        price = Booking.roomsPrice[5];
                                        System.out.println("You have chosen :" + room);
                                        System.out.println("Price: " + price);
                                    }
                                    break;
                                default:
                                    throw new DataException(errorMessage.msg[0]);
                            }
        
                            System.out.print("\nHow many days will you be staying? : "); double days = input.nextDouble();
                            while(days>30){
                                // throw new DataException(errorMessage.msg[2]);
                                System.out.print("\n How many days will you be staying? : "); days = input.nextDouble();
                            }
                            
                            System.out.println("\nMode of Payment:");
                            System.out.println("[1]Credit Card" + 
                                                "\n[2]Paymaya" + 
                                                "\n[3]Gcash" + 
                                                "\n[4]Cash on Hand");
                            System.out.print("Mode of Payment Choice : "); int paymentInput=input.nextInt();
                            
                            String ModePayment;
                            if(paymentInput==1) ModePayment = "Credit Card";
                            else if(paymentInput==2) ModePayment = "PayMaya";
                            else if(paymentInput==3) ModePayment = "GCash";
                            else if(paymentInput==4) ModePayment = "Cash on Hand";
                            else throw new DataException(errorMessage.msg[0]);
                            
                            guest = new Booking(room, days, null, name, roomInput, paymentInput, userInput);
                            guest.display();
                            break;
                        }
                        else if (userInput == 'N'){
                            System.out.println("\n");
                        }else{
                            throw new DataException(errorMessage.msg[0]);
                        }
                    }   
                } else if (menuInput == 2){
                    System.out.println(decorator.repeat(20));
                    System.out.println("\nList of Rooms available:\n");
                    for(int i=0;i<4;i++){
                        System.out.println("1."+ Booking.rooms[i]);
                    }
                    System.out.print(decorator.repeat(20) +
                                                      "\n--Option:--" + 
                                                      "\n[1]Go Back" + 
                                                      "\n[2]Exit\n" +
                                                      decorator.repeat(20) +"\n Option Choice: ");
                    int optionInput=input.nextInt();
                    if(optionInput==2)
                        System.out.println("Thank you! ~Reilosh Tranquility Hotel");
                        break;
                } else if (menuInput == 3){
                    System.out.println("Thank you! ~Reilosh Tranquility Hotel");
                    break;
                } else {
                    throw new DataException(errorMessage.msg[0]);
                }
            }   
        }catch(InputMismatchException e){
            System.out.println(errorMessage.msg[0]);
        }catch(DataException e){
            System.out.println(e.getMessage());
        }
    }
}