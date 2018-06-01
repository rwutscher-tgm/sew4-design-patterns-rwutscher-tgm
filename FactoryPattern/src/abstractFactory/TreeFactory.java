package abstractFactory;

public class TreeFactory implements OrganismFactory{

    private String nextTree;

    @Override
    public Tree createRandom(){
        int rnd = (int) Math.random() * 3;

        if(rnd == 3){
            return new Oak();
        }else if(rnd == 2){
            return new Birch();
        }else{
            return new Sprouce();
        }
    }

    @Override
    public Tree createBalanced(){
        if(nextTree == "Oak"){

            nextTree = "Birch";
            return new Oak();

        }else if(nextTree == "Birch"){

            nextTree = "Sprouce";
            return new Birch();

        }else if(nextTree == "Sprouce"){

            nextTree = "Oak";
            return new Sprouce();

        }else{
            nextTree = "Oak";
            return new Sprouce();
        }
    }
}
