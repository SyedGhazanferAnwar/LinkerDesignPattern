package linkerdesignpattern;

import java.util.Scanner;

public class LinkerDesignPattern {

    public static void main(String[] args) {
        Actuator actuator=new Actuator();
        VendorA vendora=new VendorA();
        VendorB vendorb=new VendorB();
        int z=124;
        Ticket ticket=new Ticket("123",true,50);
        actuator.addTicket(ticket);
        Scanner sc=new Scanner(System.in);
        while(true){
            int opt=sc.nextInt();
            
            switch(opt){
                case 1:
                    actuator.addTicket(new Ticket(z+++"",true,50));
                    break;
                case 2:
                    actuator.buyTicket(ticket);
                 
            }
        
        }
    }
    
}
