public class Main {

    public static void main(String[] args) {
        Drink g1 = new CaramelAddOn(new ChilliAddOn(new ChockolateAddOn(new Espresso())));
        System.out.println(g1.cost());
    }
}
