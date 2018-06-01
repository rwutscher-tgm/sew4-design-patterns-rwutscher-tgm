package strategyPattern;

import strategyPattern.DisplayStrategies.GraphicDisplaying;
import strategyPattern.DisplayStrategies.NoDisplaying;
import strategyPattern.DisplayStrategies.TextDisplaying;
import strategyPattern.FlyStrategies.FlappFlying;
import strategyPattern.FlyStrategies.NoFlying;
import strategyPattern.QuackStrategies.LoudQuacking;
import strategyPattern.QuackStrategies.NoQuacking;

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
