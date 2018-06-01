package strategyPattern.FlyStrategies;


public class GlideFlying implements FlyStrategy {
    public void fly(){
        System.out.println("Your duck glides like a majestic eagle");
    }
}