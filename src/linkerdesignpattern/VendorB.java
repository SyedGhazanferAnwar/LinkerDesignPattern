package linkerdesignpattern;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            Book book=(Book)books.get(i);
            System.out.println("Vendor B getting notified about new catalog-----"+book.toString());
            if(book.getName().equals("The Shining") && book.IsAvailable()){
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {                            
                            Thread.sleep(100);   
                            sellBook(book);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(VendorA.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }).start();
            }
            
        }
    }
    
       void sellBook(Book book){
        System.out.println("********************************************");
        System.out.println("Now selling "+book.getName());

        Actuator actuator = new Actuator();
        actuator.sellBook(book);
    }

}
