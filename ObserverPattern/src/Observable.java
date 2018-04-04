import java.util.ArrayList;

public abstract class Observable{
    // Die Liste der angemeldeten Observer
    protected ArrayList<Observer> observers = new ArrayList();

    /**
     * Wird vom Observer zum anmelden am Observable verwendet
     * @param observer der Observer der angemeldet werden soll
     */
    public void add(Observer observer){
        this.observers.add(observer);
    }

    /**
     * Wird vom Observer zum abmelden vom Observable verwendet
     * @param observer der Observer der abgemeldet werden soll
     */
    public void remove(Observer observer){
        this.observers.remove(observer);
    }

    /**
     * Benachrichtigt die Observer, dass sich die Daten geändert haben
     */
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
    }
}