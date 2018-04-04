import java.util.ArrayList;

public abstract class Observable{
    protected ArrayList<Observer> observers = new ArrayList();

    public void add(Observer observer){
        this.observers.add(observer);
    }

    public void remove(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
    }
}