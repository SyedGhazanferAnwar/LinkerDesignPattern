
package linkerdesignpattern;

import java.util.ArrayList;

public class Actuator {
    Source source=Source.getSource();
    
    public void addTicket(Ticket ticket){
        ArrayList<Object> tickets=source.getArray();
        tickets.add(ticket);
        source.setArray(tickets);
    }
    
    public void buyTicket(Ticket _ticket){
        ArrayList<Object> tickets=source.getArray();
        for(int i=0;i<tickets.size();i++){
            if(((Ticket)tickets.get(i)).id.equals(_ticket.id)){
                ((Ticket)tickets.get(i)).isAvailable=false;
                break;
            }
        }
        source.setArray(tickets);
    }
}
