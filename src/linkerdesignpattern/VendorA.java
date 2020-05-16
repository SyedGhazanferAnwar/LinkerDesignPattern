
package linkerdesignpattern;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Syed Ghazanfer Anwar
 */
public class VendorA extends Observer {
    /** 
    * @desc This is vendor A class. this is a book Vendor which is being updated about the catalog changes
    * @author Salman Arshad, Syed Ghazanfer Anwar and Asim Iqbal
    */
    public VendorA() {
        Source.getSource().attach(this);
        System.out.println("Vendor A is wants  Harry Potter in the catalog!!! ");
    }

    @Override
    public void update(ArrayList<Object> books) {
        for (int i = 0; i < books.size(); i++) {
            Book book=(Book)books.get(i);
            System.out.println("Vendor A getting notified about new catalog-----"+book.toString());
            if(book.getName().equals("Harry Potter") && book.IsAvailable()){
                System.out.println("*****Vendor A is notified that Harry Potter is added in catalog. So he is selling it");
                sellBook(book);   
            }
            
        }
    }
    void sellBook(Book book){
        Actuator actuator = new Actuator();
        actuator.sellBook(book);
    }
    
}
