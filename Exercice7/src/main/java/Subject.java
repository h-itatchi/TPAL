import java.util.ArrayList;

public class Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void notifyAllObservers(){
        observers.forEach(o->o.update());
    }

}
