public class MilkAddOn extends AddOnDecorator{

	public MilkAddOn(Drink drink){
		this.drink = drink;
	}

	public double cost() {
		return drink.cost() + 0.3;
	}

}
