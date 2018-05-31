import DisplayStrategies.GraphicDisplaying;
import DisplayStrategies.NoDisplaying;
import DisplayStrategies.TextDisplaying;
import FlyStrategies.FlappFlying;
import FlyStrategies.NoFlying;
import QuackStrategies.LoudQuacking;
import QuackStrategies.NoQuacking;

public class Main {

    public static void main(String[] args) {
        Duck wildeEnte = new Duck(new FlappFlying(), new LoudQuacking(), new GraphicDisplaying());
        Duck parkEnte = new Duck(new NoFlying(), new LoudQuacking(), new TextDisplaying());
        Duck rubberDuck = new Duck(new NoFlying(), new NoQuacking(), new NoDisplaying());

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
