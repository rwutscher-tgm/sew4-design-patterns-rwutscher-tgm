package abstractFactory;

import factoryMethod.BalancedAnimalFactory;
import factoryMethod.RandomAnimalFactory;

public class Main {
    public static void main(String[] args) {
        TreeFactory tree = new TreeFactory();
        AnimalFactory animal = new AnimalFactory();

        System.out.println("Balanced Trees:");
        System.out.println(tree.createBalanced().getClass().toString());
        System.out.println(tree.createBalanced().getClass().toString());
        System.out.println(tree.createBalanced().getClass().toString());

        System.out.println("Random Trees");
        System.out.println(tree.createRandom().getClass().toString());
        System.out.println(tree.createRandom().getClass().toString());
        System.out.println(tree.createRandom().getClass().toString());

        System.out.println("Balanced Animals");
        System.out.println(animal.createBalanced().getClass().toString());
        System.out.println(animal.createBalanced().getClass().toString());
        System.out.println(animal.createBalanced().getClass().toString());

        System.out.println("Random Animals");
        System.out.println(animal.createRandom().getClass().toString());
        System.out.println(animal.createRandom().getClass().toString());
        System.out.println(animal.createRandom().getClass().toString());
    }
}