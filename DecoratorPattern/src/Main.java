public class Main {

    public static void main(String[] args) {
        Getraenk g1 = new CaramelAddOn(new ChilliAddOn(new SpinachAddOn(new Espresso())));
        System.out.println(g1.cost());
    }
}
