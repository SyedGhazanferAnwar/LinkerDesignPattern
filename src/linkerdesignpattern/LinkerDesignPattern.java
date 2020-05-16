package linkerdesignpattern;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class LinkerDesignPattern {
        /** 
    * @desc This is the main implementation of the Linker design pattern
    * @author Salman Arshad, Syed Ghazanfer Anwar and Asim Iqbal
    */

    public static void main(String[] args) throws InterruptedException {
        // declaring actuator
        Actuator actuator=new Actuator();
        
        // declaring vendors who are selling books from source
        System.out.println("Initializing Vendors...");
        VendorA vendora = new VendorA();
        VendorB vendorb = new VendorB();

        //Initializing some books to to added in source for selling
        System.out.println("Initializing books...");
        Book book1  = new Book(1,"The Shining",true,100,"65K68654T6","Stephen King");      
        Book book2  = new Book(2,"Harry Potter",true,150,"95O68694I8","George W. Bush");
        Book book3  = new Book(3,"Alex Cross",true,200,"95O68694I8", "James Patterson");
        
        // Adding books to store 
        System.out.println("Adding books to store...");
        System.out.println("********************************************");
        actuator.addBook(book1);
       TimeUnit.SECONDS.sleep(2);
       
        System.out.println("********************************************");
        actuator.addBook(book2);
        TimeUnit.SECONDS.sleep(2);

        System.out.println("********************************************");
        actuator.addBook(book3);
        TimeUnit.SECONDS.sleep(2);
        
        
//        System.out.println("********************************************");        
//        System.out.println("Now selling Harry potter..");
//        actuator.sellBook(book2);
    }
    
}
