/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkerdesignpattern;

import java.util.ArrayList;

/**
 *
 * @author Syed Ghazanfer Anwar
 */
public class VendorB extends Observer {

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
