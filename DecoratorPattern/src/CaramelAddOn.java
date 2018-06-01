
public class CaramelAddOn extends AddOnDecorator{

	public CaramelAddOn(Drink drink){
		this.drink = drink;
	}
	
	public double cost() {
		return drink.cost() + 0.3;
	}

}
