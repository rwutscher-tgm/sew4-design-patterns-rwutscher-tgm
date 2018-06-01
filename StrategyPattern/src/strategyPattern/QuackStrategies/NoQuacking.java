package strategyPattern.QuackStrategies;

public class NoQuacking implements QuackStrategy{
    public void quack(){
        System.out.println("Your duck can not quack");
    }
}