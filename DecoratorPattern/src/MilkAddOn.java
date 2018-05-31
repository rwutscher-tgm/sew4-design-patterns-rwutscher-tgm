public class MilkAddOn extends AddOnDecorator{

	public double cost() {
		return drink.cost() + 0.3;
	}

}
