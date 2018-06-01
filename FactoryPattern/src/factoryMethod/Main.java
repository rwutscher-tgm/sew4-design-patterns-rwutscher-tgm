package factoryMethod;

public class Main {
    public static void main(String[] args) {
        BalancedAnimalFactory balanced = new BalancedAnimalFactory();
        RandomAnimalFactory random = new RandomAnimalFactory();

        System.out.println("Balanced");
        System.out.println(balanced.createAnimal().getClass().toString());
        System.out.println(balanced.createAnimal().getClass().toString());
        System.out.println(balanced.createAnimal().getClass().toString());

        System.out.println("Random");
        System.out.println(random.createAnimal().getClass().toString());
        System.out.println(random.createAnimal().getClass().toString());
        System.out.println(random.createAnimal().getClass().toString());
    }
}
