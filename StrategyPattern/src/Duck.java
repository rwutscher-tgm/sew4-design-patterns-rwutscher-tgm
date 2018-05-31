import DisplayStrategies.DisplayStrategy;
import FlyStrategies.FlyStrategy;
import QuackStrategies.QuackStrategy;

public class Duck {
    private FlyStrategy flyStrat;
    private QuackStrategy quackStrat;
    private DisplayStrategy displayStrat;

    public Duck(FlyStrategy flyStrat, QuackStrategy quackStrat, DisplayStrategy displayStrat){
        this.flyStrat = flyStrat;
        this.quackStrat = quackStrat;
        this.displayStrat = displayStrat;
    }

    public void display(){
        this.displayStrat.display();
    }

    public void fly(){
        this.flyStrat.fly();
    }

    public void quack(){
        this.quackStrat.quack();
    }
}
