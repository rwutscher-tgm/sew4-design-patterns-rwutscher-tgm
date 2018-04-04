## Observer Pattern

### Problem

Viele Objekte wollen wissen wenn sich ein Objekt ändert

### Beispiel

Es wird eine Wetterstation aufgestellt die mehrere Wetterdaten misst. Viele Displays wollen wissen wann sich die Wetterdaten ändern.

### Lösung

Man erstellt ein Objekt (Observable) das die gewünschten Daten und eine Collection der Objekte die benachrichtigt werden wollen. Die Objekte die wissen wollen wann sich die Daten ändern (Observer) können sich beim Observable registrieren und abmelden.

### UML

### Code

Als erstes müssen zwei abstrakte Klassen und ein Interface erstellt werden:

* Die Observable Klasse mit den Methoden add(), remove(), notifyObservers()
* Die Observer Klasse mit der Methode update()
* Das Display Interface mit der Methode display()

```java

public abstract class Observable{
	private ArrayList<Observer> observers = new ArrayList();

	public void add(Observer observer){
		this.observers.add(observer);
	}

	public void remove(Observer observer){
		this.observers.remove(observer);
	}

	public void notifyObservers(){
		for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
	}
}

public abstract class Observer{
	public abstract void update();
}

public interface Display {
    public void display();
}

```

Dann werden die  Weatherstation und Displays implementiert

```java

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

```

Letztens können die Weatherstation und Displays erstellt und aktiviert werden

```java

public class Main {

    public static void main(String[] args) {
        WeatherStation w1 = new WeatherStation();
        w1.simulateChange();

        TVDisplay d1 = new TVDisplay(w1);
        PhoneDisplay d2 = new PhoneDisplay(w1);

        w1.simulateChange();
    }
}


```
