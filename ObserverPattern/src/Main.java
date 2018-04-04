public class Main {

    public static void main(String[] args) {
        WeatherStation w1 = new WeatherStation();
        w1.simulateChange();

        TVDisplay d1 = new TVDisplay(w1);
        PhoneDisplay d2 = new PhoneDisplay(w1);

        w1.simulateChange();

        d1.close();
        d2.close();
    }
}
