package abstractFactory;

public interface OrganismFactory {
    public Organism createBalanced();
    public Organism createRandom();
}
