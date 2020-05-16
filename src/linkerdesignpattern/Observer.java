
package linkerdesignpattern;
import java.util.ArrayList;
/** 
  * @desc This is the observer abstract class. This class is method is implemented in Vendor class
  * @author Salman Arshad, Syed Ghazanfer Anwar and Asim Iqbal
*/
public abstract class Observer {
    /**
  * @desc updated the vendors about the source catalog
  * @param  ArrayList<Object> the source object
  * @return void-  mutates the source object
*/
   public abstract void update(ArrayList<Object> books);
}