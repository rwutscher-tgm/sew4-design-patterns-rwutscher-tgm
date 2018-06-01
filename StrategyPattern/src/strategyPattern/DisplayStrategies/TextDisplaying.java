package strategyPattern.DisplayStrategies;

public class TextDisplaying implements DisplayStrategy{
    public void display(){
        System.out.println("Your duck looks beautiful");
    }
}