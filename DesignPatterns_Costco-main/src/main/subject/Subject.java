// Subject Interface
package subject;

import observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String itemName);
}
