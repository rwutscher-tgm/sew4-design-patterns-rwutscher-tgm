public class ChocolateAddOn extends AddOnDecorator{

	public ChocolateAddOn(Drink drink){
		this.drink = drink;
	}
	
	public double cost() {
		return drink.cost() + 0.3;
	}

}
