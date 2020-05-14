package linkerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Source {

    static Source source;
    private List<Observer> observers = new ArrayList<Observer>();
    ArrayList<Object> objects = new ArrayList<Object>();

    private Source() {
    }

    static Source getSource() {
        if (source == null) {
            source = new Source();
        }
        return source;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(objects);
        }
    }

    public ArrayList<Object> getArray() {
        return objects;
    }

    public void setArray(ArrayList<Object> objects) {
        this.objects = objects;
        // Notify all links
        notifyAllObservers();
    }

}
