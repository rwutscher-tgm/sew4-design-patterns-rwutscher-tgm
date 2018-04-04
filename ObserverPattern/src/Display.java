public abstract class Display extends Observer{

    protected WeatherStation weatherStation;

    protected float temperature;
    protected float humidity;
    protected float windspeed;
    protected double lightspeed;

    /**
     * Initialisiert Den Display indem er sich bei der Wetterstation anmeldet und die aktuellen Daten anzeigt
     * @param weatherStation Die Wetterstation bei der sich das Display anmelden soll
     */
    protected void init(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        this.weatherStation.add(this);

        this.update();
    }

    public void close(){
        this.weatherStation.remove(this);
    }

    public void update(){
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.windspeed = weatherStation.getWindspeed();
        this.lightspeed = weatherStation.getLightspeed();

        this.display();
    }

    /**
     * Zeigt die aktuellen Daten an
     */
    public abstract void display();
}
