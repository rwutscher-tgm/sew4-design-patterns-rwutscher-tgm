public class WeatherStation extends Observable{

    private float temperature;
    private float humidity;
    private float windspeed;
    private double lightspeed;

    public WeatherStation(){
        this.temperature = 0;
        this.humidity = 0;
        this.windspeed = 0;
        this.lightspeed = 299792458;
    }

    public void simulateChange(){
        this.temperature = (int) (Math.random() * 50);
        this.humidity = (int) (Math.random() * 100);
        this.windspeed = (int) (Math.random() * 250);
        this.lightspeed = lightspeed + (Math.random() * -0.1);

        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getWindspeed() {
        return windspeed;
    }

    public double getLightspeed() {
        return lightspeed;
    }

}
