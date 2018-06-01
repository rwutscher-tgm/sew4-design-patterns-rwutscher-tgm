package commandPattern;

public class TurnOnLight implements Task{

    private Lamp lamp;

    public TurnOnLight(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.setState(true);
    }

    @Override
    public void unExecute(){
    	lamp.setState(false);
    }
}