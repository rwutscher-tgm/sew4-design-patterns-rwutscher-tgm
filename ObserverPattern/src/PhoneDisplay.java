public class PhoneDisplay extends Observer implements Display{

    private WeatherStation weatherStation;

    private float temperature;
    private float humidity;
    private float windspeed;
    private double lightspeed;

    public PhoneDisplay(WeatherStation weatherStation){
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
        System.out.println("----------\n- Temperature: "+this.temperature+"\n- Humidity: "+this.humidity+"\n- Windspeed: "+this.windspeed+"\n- Lightspeed: "+this.lightspeed+"\n----------");
    }
    public void update(){
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
        this.windspeed = weatherStation.getWindspeed();
        this.lightspeed = weatherStation.getLightspeed();

        this.display();
    }
}
