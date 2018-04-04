public class TVDisplay extends Display{

    private WeatherStation weatherStation;

    private float temperature;
    private float humidity;
    private float windspeed;
    private double lightspeed;

    public TVDisplay(WeatherStation weatherStation){
        this.init(weatherStation);
    }

    public void display(){
        System.out.println("Temperature: "+this.temperature+" Humidity: "+this.humidity+" Windspeed: "+this.windspeed+" Lightspeed: "+this.lightspeed);
    }
}
