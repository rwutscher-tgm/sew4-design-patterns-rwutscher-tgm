package factoryMethod;

public class RandomAnimalFactory implements AnimalFactory{

    @Override
    public Animal createAnimal(){
        int rnd = (int) Math.random() * 3;

        if(rnd == 3){
            return new Dog();
        }else if(rnd == 2){
            return new Cat();
        }else{
            return new Duck();
        }
    }
}