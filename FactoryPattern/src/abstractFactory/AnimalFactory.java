package abstractFactory;

import java.util.Random;

public class AnimalFactory implements OrganismFactory{

    private String nextAnimal;

    @Override
    public Animal createRandom(){
        Random rand = new Random();
        int rnd = rand.nextInt(3)+1;

        if(rnd == 3){
            return new Dog();
        }else if(rnd == 2){
            return new Cat();
        }else{
            return new Duck();
        }
    }

    @Override
    public Animal createBalanced(){
        if(nextAnimal == "Dog"){

            nextAnimal = "Cat";
            return new Dog();

        }else if(nextAnimal == "Cat"){

            nextAnimal = "Duck";
            return new Cat();

        }else if(nextAnimal == "Duck"){

            nextAnimal = "Dog";
            return new Duck();

        }else{
            nextAnimal = "Cat";
            return new Dog();
        }
    }
}
