
package linkerdesignpattern;

import java.util.ArrayList;

public class Actuator {
    Source source=Source.getSource();
    
    public void addBook(Book ticket){
        ArrayList<Object> tickets=source.getArray();
        tickets.add(ticket);
        source.setArray(tickets);
    }
    
    public void sellBook(Book book){
        ArrayList<Object> books=source.getArray();
        for(int i=0;i<books.size();i++){
            if(((Book)books.get(i)).getId() ==(book.getId())){
                ((Book)books.get(i)).setIsAvailable(false);
                break;
            }
        }
        source.setArray(books);
    }
}
