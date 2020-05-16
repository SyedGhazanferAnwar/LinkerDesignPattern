package linkerdesignpattern;
import java.util.ArrayList;

public class VendorB extends Observer {
        /** 
    * @desc This is vendor b class. this is a book Vendor which is being updated about the catalog changes
    * @author Salman Arshad, Syed Ghazanfer Anwar and Asim Iqbal
    */
    VendorB() {
        Source.getSource().attach(this);
    }

    @Override
    public void update(ArrayList<Object> books) {
        for (int i = 0; i < books.size(); i++) {
            Book book = (Book) books.get(i);
            System.out.println("Vendor B getting notified about new catalog-----"+book.toString());
        }
    }

}
