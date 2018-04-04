import DisplayStrategies.GraphicDisplaying;
import DisplayStrategies.NoDisplaying;
import DisplayStrategies.TextDisplaying;
import FlyStrategies.FlappFlying;
import FlyStrategies.NoFlying;
import QuackStrategies.LoudQuacking;
import QuackStrategies.NoQuacking;

public class Main {

    public static void main(String[] args) {
        Ente wildeEnte = new Ente(new FlappFlying(), new LoudQuacking(), new GraphicDisplaying());
        Ente parkEnte = new Ente(new NoFlying(), new LoudQuacking(), new TextDisplaying());
        Ente rubberDuck = new Ente(new NoFlying(), new NoQuacking(), new NoDisplaying());

        wildeEnte.display();
        parkEnte.display();
        rubberDuck.display();

        wildeEnte.quack();
        parkEnte.quack();
        rubberDuck.quack();

        wildeEnte.fly();
        parkEnte.fly();
        rubberDuck.fly();
    }
}
