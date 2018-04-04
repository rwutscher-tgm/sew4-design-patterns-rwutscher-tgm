public class TVDisplay extends Observer implements Display{

    private WeatherStation weatherStation;

    private float temperature;
    private float humidity;
    private float windspeed;
    private double lightspeed;

    public TVDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        this.weatherStation.add(this);

        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.windspeed = weatherStation.getWindspeed();
        this.lightspeed = weatherStation.getLightspeed();
    }

    public void close(){
        this.weatherStation.remove(this);
    }

    public void display(){
        System.out.println("Temperature: "+this.temperature+" Humidity: "+this.humidity+" Windspeed: "+this.windspeed+" Lightspeed: "+this.lightspeed);
    }
    public void update(){
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.windspeed = weatherStation.getWindspeed();
        this.lightspeed = weatherStation.getLightspeed();

        this.display();
    }
}
