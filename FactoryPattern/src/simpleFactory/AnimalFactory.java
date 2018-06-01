package simpleFactory;


public class AnimalFactory{

    public Animal getRandomAnimal(){
        int rnd = (int) Math.random() * 3;

        if(rnd == 3){
            return new Dog();
        }else if(rnd == 2){
            return new Cat();
        }else{
            return new Duck();
        }
    }

    private String nextAnimal;

    public Animal getBalancedAnimal(){
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