public abstract class Observer{

    /**
     * Aktualisiert die gespeicherten Wetterdaten mit denen von der Wetterstation
     */
    public abstract void update();

    /**
     * Meldet das Display von der Wetterstation ab
     */
    public abstract void close();
}