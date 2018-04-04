public class PhoneDisplay extends Display{

    public PhoneDisplay(WeatherStation weatherStation){
        this.init(weatherStation);
    }

    public void display(){
        System.out.println("----------\n- Temperature: "+this.temperature+"\n- Humidity: "+this.humidity+"\n- Windspeed: "+this.windspeed+"\n- Lightspeed: "+this.lightspeed+"\n----------");
    }

}
