package commandPattern;

public class Main {
    public static void main(String[] args){
        Lamp lamp = new Lamp(false);
        Task t = new TurnOnLight(lamp);
        System.out.println(lamp.isState());
        t.execute();
        System.out.println(lamp.isState());
        t.unExecute();
        System.out.println(lamp.isState());
    }
}
