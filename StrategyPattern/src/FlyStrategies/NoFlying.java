package FlyStrategies;

public class NoFlying implements FlyStrategy {
    public void fly(){
        System.out.println("Your duck lacks the ability to lift itself into the sky");
    }
}