
public class ChilliAddOn extends AddOnDecorator{

	public ChilliAddOn(Drink drink){
		this.drink = drink;
	}
	
	public double cost() {
		return drink.cost() + 0.3;
	}

}
