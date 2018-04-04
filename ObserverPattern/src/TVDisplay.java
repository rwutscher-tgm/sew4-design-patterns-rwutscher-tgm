public class TVDisplay extends Display{

    public TVDisplay(WeatherStation weatherStation){
        this.init(weatherStation);
    }

    public void display(){
        System.out.println("Temperature: "+this.temperature+" Humidity: "+this.humidity+" Windspeed: "+this.windspeed+" Lightspeed: "+this.lightspeed);
    }
}
