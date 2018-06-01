package simpleFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        System.out.println("Balanced");
        System.out.println(animalFactory.getBalancedAnimal().getClass().toString());
        System.out.println(animalFactory.getBalancedAnimal().getClass().toString());
        System.out.println(animalFactory.getBalancedAnimal().getClass().toString());

        System.out.println("Random");
        System.out.println(animalFactory.getRandomAnimal().getClass().toString());
        System.out.println(animalFactory.getRandomAnimal().getClass().toString());
        System.out.println(animalFactory.getRandomAnimal().getClass().toString());
    }
}
