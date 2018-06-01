package factoryMethod;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory{

    @Override
    public Animal createAnimal(){
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
}